package com.chen.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.common.entity.db.system.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> findUserPermissions(String username);
}