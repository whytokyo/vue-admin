package com.yanxi.system.service.impl;

import com.yanxi.system.entity.User;
import com.yanxi.system.mapper.UserMapper;
import com.yanxi.system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User selectUserByUserName(String username) {
        return userMapper.selectUserByUserName(username);
    }

    @Override
    public List<User> selectUserByCondition(User user) {
        return userMapper.selectUserByCondition(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int delUser(Long userId) {
        return userMapper.delUser(userId);
    }
}
