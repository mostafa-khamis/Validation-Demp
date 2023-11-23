package com.example.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode,String> {
private String codePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        codePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode !=null) {
            result=theCode.startsWith(codePrefix);
        }else {
            result =true;
        }
        return result;
    }
}
