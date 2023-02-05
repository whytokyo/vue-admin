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

    public User(Long deptId, String userName, String nickName, String password) {
        this.deptId = deptId;
        this.userName = userName;
        this.nickName = nickName;
        this.password = password;
    }

    public User(Long deptId) {
        this.deptId = deptId;
    }

    public User() {
    }

    public User(Long userId, Long deptId) {
        this.userId = userId;
        this.deptId = deptId;
    }
}
