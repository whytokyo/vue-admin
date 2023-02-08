package com.yanxi.system.service;

import com.yanxi.system.entity.User;
import com.yanxi.system.entity.VO.UserInfo;

import java.util.List;

public interface UserService {
    User selectUserByUserName(String username);
    List<UserInfo> selectUserByCondition(User user);
    int addUser(User user);
    int updateUser(User user);
    int delUser(Long userId);
}
