package com.chen.serversystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.common.entity.db.system.UserRole;
import com.chen.serversystem.mapper.UserRoleMapper;
import com.chen.serversystem.service.IUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("userRoleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUserRolesByRoleId(String[] roleIds) {
		List<String> list = Arrays.asList(roleIds);
		this.baseMapper.delete(new LambdaQueryWrapper<UserRole>().in(UserRole::getRoleId, list));
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUserRolesByUserId(String[] userIds) {
		List<String> list = Arrays.asList(userIds);
		this.baseMapper.delete(new LambdaQueryWrapper<UserRole>().in(UserRole::getUserId, list));
	}

	@Override
	public List<String> findUserIdsByRoleId(String[] roleIds) {
		List<UserRole> list = baseMapper.selectList(new LambdaQueryWrapper<UserRole>().in(UserRole::getRoleId, String.join(",", roleIds)));
		return list.stream().map(userRole -> String.valueOf(userRole.getUserId())).collect(Collectors.toList());
	}

}