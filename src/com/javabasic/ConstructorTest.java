package com.javabasic;

public class ConstructorTest {

    public static void main(String[] args) {

        Human human1 = new Human("Mehedi", 22);
        Human human2 = new Human("Aziz", 23);
        Human human3 = new Human("Shanta", 24);


//        System.out.println("This is Human-1 object values: " + human1.name);
//        System.out.println("This is Human-1 object values: " + human1.age);

        human1.eat();

//        System.out.println("This is Human-2 object values: " + human2.name);
//        System.out.println("This is Human-2 object values: " + human2.age);



//        System.out.println("This is Human-3 object values: " + human3.name);
//        System.out.println("This is Human-3 object values: " + human3.age);
    }

}
