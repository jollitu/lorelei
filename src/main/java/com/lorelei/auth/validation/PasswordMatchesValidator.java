package com.lorelei.auth.validation;

import com.lorelei.auth.validation.annotations.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, String>
{
    @Override
    public void initialize(PasswordMatches constraintAnnotation)
    {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext)
    {
        return false;
    }
}
