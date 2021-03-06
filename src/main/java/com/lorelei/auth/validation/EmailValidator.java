package com.lorelei.auth.validation;

import com.lorelei.auth.validation.annotations.ValidEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<ValidEmail, String>
{
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})$";

    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    @Override
    public void initialize(ValidEmail validEmail)
    {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext)
    {
        return validateEmail(email);
    }

    private boolean validateEmail(String email)
    {
        matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
