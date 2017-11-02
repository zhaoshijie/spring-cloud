package com.api.service;

import com.api.domain.SysUser;

/**
 * @author kaze 2017/10/29
 */
public interface SysUserService {

    /**
     * 根据主键获取实体
     *
     * @param id 用户主键
     * @return SysUser
     */
    SysUser get(Integer id);

    /**
     * 根据登录名查找用户
     *
     * @param username 用户名
     * @return SysUser
     */
    SysUser findByUsername(String username);

}
