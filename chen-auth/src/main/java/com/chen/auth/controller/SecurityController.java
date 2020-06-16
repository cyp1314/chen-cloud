package com.chen.auth.controller;

import com.chen.auth.exception.ValidateCodeException;
import com.chen.auth.service.ValidateCodeService;
import com.chen.common.entity.AuthUser;
import com.chen.common.entity.oauth.User;
import com.chen.common.entity.result.MyResponse;
import com.chen.common.exception.MyAuthException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

@RestController
public class SecurityController {

    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @Autowired
    private ValidateCodeService validateCodeService;

    @GetMapping("captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException, ValidateCodeException {
        validateCodeService.create(request, response);
    }

    @GetMapping("user")
    public AuthUser currentUser() {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        AuthUser user = (AuthUser)principal;
        return user;
    }

    @DeleteMapping("signout")
    public MyResponse signout(HttpServletRequest request) throws MyAuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        MyResponse febsResponse = new MyResponse();
        if (!consumerTokenServices.revokeToken(token)) {
            throw new MyAuthException("退出登录失败");
        }
        return febsResponse.message("退出登录成功");
    }
}