package com.yanxi.system.service.impl;

import com.yanxi.system.entity.User;
import com.yanxi.system.mapper.UserMapper;
import com.yanxi.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserByUserName(String username) {
        return userMapper.selectUserByUserName(username);
    }
}
