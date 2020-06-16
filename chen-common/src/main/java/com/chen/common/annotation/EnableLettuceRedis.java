package com.chen.common.annotation;

import com.chen.common.configure.LettuceRedisConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LettuceRedisConfigure.class)
public @interface EnableLettuceRedis {
}
