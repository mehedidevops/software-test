package com.javabasic;

public class Students {

    String name;
    String email;


    public Students(String name, String email) {
        this.name = name;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
