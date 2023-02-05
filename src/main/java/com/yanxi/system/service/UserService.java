package com.yanxi.system.service;

import com.yanxi.system.entity.User;

import java.util.List;

public interface UserService {
    User selectUserByUserName(String username);
    List<User> selectUserByCondition(User user);
    int addUser(User user);
    int updateUser(User user);
    int delUser(Long userId);
}
