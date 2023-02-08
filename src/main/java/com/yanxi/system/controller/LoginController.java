package com.yanxi.system.controller;

import com.yanxi.common.model.dto.ResponseResult;
import com.yanxi.common.utils.ServletUtils;
import com.yanxi.system.entity.User;
import com.yanxi.system.security.LoginBody;
import com.yanxi.system.security.LoginUser;
import com.yanxi.system.security.service.TokenService;
import com.yanxi.system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Resource
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody LoginBody loginBody) {
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        Map<String, Object> result = new HashMap<>();
        result.put("token", token);
        return ResponseResult.okResult(result);
    }

    @GetMapping("/getInfo")
    public ResponseResult getInfo() {
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        User user = loginUser.getUser();
//        User user = SecurityUtils.getLoginUser().getUser();
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        return ResponseResult.okResult(map);
    }
}
