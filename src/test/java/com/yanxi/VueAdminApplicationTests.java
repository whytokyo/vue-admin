package com.yanxi;

import com.yanxi.system.mapper.UserMapper;
import com.yanxi.system.security.LoginUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@SpringBootTest
class VueAdminApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private AuthenticationManager authenticationManager;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private String username = "admin";

    private String password = "123456";

    @Test
    void contextLoads() {
        Authentication authentication = null;
        authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        System.out.println(loginUser);
    }

    @Test
    void test() {
        System.out.println(passwordEncoder.encode("123456"));
    }

}
