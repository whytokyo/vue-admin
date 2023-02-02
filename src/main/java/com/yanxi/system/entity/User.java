package com.yanxi.system.entity;

import com.yanxi.common.model.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class User extends BaseEntity implements Serializable {

    private Long userId;

    private Long deptId;

    private String userName;

    private String nickName;

    private String userType;

    private String email;

    private String phonenumber;

    private String password;

}
