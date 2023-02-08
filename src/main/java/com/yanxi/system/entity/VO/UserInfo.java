package com.yanxi.system.entity.VO;

import lombok.Data;

@Data
public class UserInfo {

    private Long userId;

    private Long deptId;

    private String userName;

    private String nickName;

    private String userType;

    private String email;

    private String phonenumber;

    private String password;

    private String deptName;
}
