package com.javabasic;

public class IfElseDemo {

    /*
    Hello this java class I am learning if else logics
     */


    public static void main(String[] args) {

        // this topic was if else
        int a = 5;
        int b = 3;

        String conditionResult = (b > a) ? a + " is greater than " + b : a + " is not greater than " + b;
        System.out.println(conditionResult);


        int time = 21;

        if (time < 10) {
            System.out.println("Good Morning");
        } else if (time < 20) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good Evening");
        }


//        if (b > a) {
//
//            System.out.println(a + " is greater than " + b );
//
//        } else {
//
//            System.out.println(a + " is not greater than " + b);
//
//        }


        //If
        //If else
        //if elseif elseif else - nested

//        int lane1length = 200;
//        int lane2length = 100;
//
//        if (lane1length > lane2length) {
//            //
//            System.out.println("Shake my car");
//        } else {
//            System.out.println("Don't shake my car");
//        }

        String userName = "shopmehedi@gmail.com";
        String password = "123456";

        if ((userName == "shopmehedi@gmail.com") && (password == "123456")) {
            System.out.println("Welcome to my account");

        } else {
            System.out.println("The User ID or password is incorrect. Please try again.");
        }

        // if else modern way
//        int a = 10;
//        int b = 9;
//
//        String result = (a > b) ? "2500" : "150";
//        System.out.println(result);

    }
}

