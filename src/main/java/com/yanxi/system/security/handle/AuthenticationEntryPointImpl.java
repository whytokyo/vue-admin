package com.yanxi.system.security.handle;

import com.yanxi.system.security.LoginUser;
import com.yanxi.system.security.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Configuration
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Autowired
    private TokenService tokenService;
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        LoginUser loginUser = tokenService.getLoginUser(request);
    }
}
