package com.trnet.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by root on 7/9/17.
 */
@Document(collection = "contact")
public class Contact {
    public String name;
    public String surname;
    public int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
