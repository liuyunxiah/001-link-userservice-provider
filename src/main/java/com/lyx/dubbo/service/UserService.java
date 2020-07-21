package com.lyx.dubbo.service;

import com.lyx.dubbo.model.User;

/**
 *
 * @author 刘云霞
 */
public interface UserService {
    /**
     * 根据ID查询user
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
