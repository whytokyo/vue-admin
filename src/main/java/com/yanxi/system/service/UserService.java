package com.yanxi.system.service;

import com.yanxi.system.entity.User;

public interface UserService {
    public User selectUserByUserName(String username);
}
