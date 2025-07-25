package com.example.validationapi.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NameValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidName {
    String message() default "Name must start with a capital letter";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}