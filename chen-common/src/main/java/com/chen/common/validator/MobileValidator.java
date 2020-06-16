package com.chen.common.validator;

import com.chen.common.annotation.IsMobile;
import com.chen.common.constant.RegexpConstant;
import com.chen.common.utils.SystemUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileValidator implements ConstraintValidator<IsMobile, String> {

    @Override
    public void initialize(IsMobile isMobile) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        try {
            if (StringUtils.isBlank(s)) {
                return true;
            } else {
                String regex = RegexpConstant.MOBILE_REG;
                return SystemUtil.match(regex, s);
            }
        } catch (Exception e) {
            return false;
        }
    }
}