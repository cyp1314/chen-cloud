package com.chen.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.common.entity.db.system.SystemUser;

public interface UserMapper extends BaseMapper<SystemUser> {
    SystemUser findByName(String username);
}