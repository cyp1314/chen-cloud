package com.chen.common.configure;

import com.chen.common.handler.SystemAccessDeniedHandler;
import com.chen.common.handler.SystemAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
public class SystemAuthExceptionConfigure {

    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public SystemAccessDeniedHandler accessDeniedHandler() {
        return new SystemAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public SystemAuthExceptionEntryPoint authenticationEntryPoint() {
        return new SystemAuthExceptionEntryPoint();
    }
}
