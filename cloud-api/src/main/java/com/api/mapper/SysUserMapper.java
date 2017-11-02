package com.api.mapper;

import com.api.domain.SysUser;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author kaze 2017/10/29
 */
public interface SysUserMapper extends Mapper<SysUser> {

    /**
     * 根据登录名查找用户
     *
     * @param username 用户名
     * @return SysUser
     */
    SysUser findByUsername(String username);

}
