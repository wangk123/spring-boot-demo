package com.example.ioc;

import lombok.Data;

@Data
public class Person {

    Person() {}

    Person(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private String name;
    private Integer age;
    private Integer sex;

}
