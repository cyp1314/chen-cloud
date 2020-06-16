package com.chen.common.annotation;

import com.chen.common.selector.ApplicationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ApplicationSelector.class)
public @interface AllApplication {
}
