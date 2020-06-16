package com.chen.common.handler;

import com.alibaba.fastjson.JSONObject;
import com.chen.common.entity.result.MyResponse;
import com.chen.common.utils.SystemUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class SystemAuthExceptionEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        MyResponse mResponse = new MyResponse();
        String message = "访问令牌不合法";
        log.error("客户端访问{}请求失败: {}", request.getRequestURI(), message, authException);
        SystemUtil.makeResponse(
                response,MediaType.APPLICATION_JSON_UTF8_VALUE,
                HttpServletResponse.SC_UNAUTHORIZED,mResponse.message("token无效")
        );

    }
}
