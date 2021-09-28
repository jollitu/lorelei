package com.lorelei.auth.validation;

import com.lorelei.auth.validation.annotations.PasswordMatches;
import com.lorelei.model.user.UserDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object>
{
    @Override
    public void initialize(PasswordMatches constraintAnnotation)
    {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext)
    {
        UserDTO user = (UserDTO) obj;

        return user.getPassword().equals(user.getMatchingPassword());
    }
}
