package com.yanxi.system.mapper;

import com.yanxi.system.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    User selectUserByUserName(@Param("userName") String username);
}
