package com.chen.common.annotation;

import com.chen.common.configure.SystemAuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author xjche
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SystemAuthExceptionConfigure.class)
public @interface EnableSystemAuthExceptionHandler {
}
