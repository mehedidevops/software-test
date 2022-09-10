package com.javabasic;

public class TypeCastingDemo {

    public static void main(String[] args) {

        //Widening casting (Automatically):
        //  byte->short->char->int->long->float->double
        //Note: why char having issue?
        byte a = 9;
        //double b = a;
        short k = a;
        System.out.println("Widening casting: " + k);

        //Questions?
//        byte i = 5;
//        char j = i;

        //Narrowing casting: (Manually)
        //double->float->long->int->char->short->byte
        double c = 5.0;
        int d = (int) c;
        System.out.println("Narrowing casting: " + d);

        byte x = 20;
        char y = (char) x;
        System.out.println(y);


    }
}
