package com.javabasic;

public class Human {

    public String name;
    public int age;
    public String location;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Human(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void eat(){
        System.out.println(this.name + " " + this.age + " " + "eating Biryani");
    }
}
