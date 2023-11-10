package com.ivand.lab2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
