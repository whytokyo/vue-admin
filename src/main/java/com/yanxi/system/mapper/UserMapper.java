package com.yanxi.system.mapper;

import com.yanxi.system.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectUserByUserName(@Param("userName") String username);
    List<User> selectUserByCondition(User user);
    int addUser(User user);
    int updateUser(User user);
    int delUser(@Param("userId") Long userId);
}
