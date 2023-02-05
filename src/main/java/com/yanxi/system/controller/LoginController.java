package com.yanxi.system.controller;

import com.yanxi.common.model.dto.ResponseResult;
import com.yanxi.system.security.LoginBody;
import com.yanxi.system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody LoginBody loginBody) {
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        Map<String, Object> result = new HashMap<>();
        result.put("token", token);
        return ResponseResult.okResult(result);
    }
}
