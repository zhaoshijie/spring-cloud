package com.api.service;

import com.api.domain.SysUser;

/**
 * @author kaze 2017/10/29
 */
public interface SysUserService {

    /**
     * 根据主键获取实体
     *
     * @param id
     * @return
     */
    SysUser get(Integer id);

}
