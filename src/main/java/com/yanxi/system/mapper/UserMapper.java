package com.yanxi.system.mapper;

import com.yanxi.system.entity.User;
import com.yanxi.system.entity.VO.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectUserByUserName(@Param("userName") String username);
    List<UserInfo> selectUserByCondition(User user);
    int addUser(User user);
    int updateUser(User user);
    int delUser(@Param("userId") Long userId);
}
