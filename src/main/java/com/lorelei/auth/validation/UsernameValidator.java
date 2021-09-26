package com.lorelei.auth.validation;

import com.lorelei.auth.validation.annotations.ValidUsername;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String>
{
    private static final String USERNAME_PATTERN = "\\w";

    private Pattern pattern = Pattern.compile(USERNAME_PATTERN);
    private Matcher matcher;

    @Override
    public void initialize(ValidUsername constraintAnnotation)
    {

    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext)
    {
        matcher = pattern.matcher(username);

        return matcher.matches();
    }
}
