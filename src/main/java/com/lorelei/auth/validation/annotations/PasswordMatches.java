package com.lorelei.auth.validation.annotations;

import com.lorelei.auth.validation.PasswordMatchesValidator;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches
{
}
