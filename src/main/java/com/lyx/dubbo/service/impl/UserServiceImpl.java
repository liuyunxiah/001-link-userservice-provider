package com.lyx.dubbo.service.impl;

import com.lyx.dubbo.model.User;
import com.lyx.dubbo.service.UserService;

/**
 * @author 刘云霞
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUserName("sdsd");
        user.setAge(13);
        return user;
    }
}
