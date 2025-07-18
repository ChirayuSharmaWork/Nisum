package com.example.validationapi.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, String> {
    public boolean isValid(String name, ConstraintValidatorContext context) {
        return name != null && Character.isUpperCase(name.charAt(0));
    }
}