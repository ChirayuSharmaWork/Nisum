package com.example.validationapi.model;

import com.example.validationapi.validator.ValidName;
import jakarta.validation.constraints.*;

public class User {
    @NotNull(message = "Id cannot be null")
    private Integer id;

    @ValidName
    private String name;

    @Min(value = 18, message = "Age must be 18 or above")
    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}