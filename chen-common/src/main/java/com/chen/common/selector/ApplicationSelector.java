package com.chen.common.selector;

import com.chen.common.configure.OAuth2FeignConfigure;
import com.chen.common.configure.ServerProtectConfigure;
import com.chen.common.configure.SystemAuthExceptionConfigure;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ApplicationSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                SystemAuthExceptionConfigure.class.getName(),
                OAuth2FeignConfigure.class.getName(),
                ServerProtectConfigure.class.getName()
        };
    }
}
