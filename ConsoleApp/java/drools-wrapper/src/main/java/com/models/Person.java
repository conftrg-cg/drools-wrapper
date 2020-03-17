package com.models;

import lombok.Getter;


public class Person {

    @Getter String name;
    @Getter int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
