package com.example.demo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
public class RequestDTO {
    @NotNull(message = "Name␣cannot␣be␣null")
    @Size(min = 3, max = 10, message = "Name␣must␣be␣between␣3␣and␣10␣characters")
    private String name;
    @NotNull(message = "Age␣cannot␣be␣null")
    private Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}