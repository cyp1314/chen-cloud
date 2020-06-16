package com.chen.common.annotation;

import com.chen.common.configure.OAuth2FeignConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(OAuth2FeignConfigure.class)
public @interface EnableSystemOauth2FeignClient {
}
