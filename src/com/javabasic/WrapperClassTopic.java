package com.javabasic;

public class WrapperClassTopic {

    // 1. Primitive
    // 2. Non-Primitive/Reference Type/Object Type Data

    //Primitive Type            Wrapper Type
    //byte                      Byte
    //short                     Short
    //int                       Integer
    //long                      Long
    //float                     Float
    //double                    Double
    //char                      Character
    //boolean                   Boolean


    public static void main(String[] args) {

        int a = 3;

        //***
        Integer b = 3;
        System.out.println(b);


        System.out.println("50" + "50");

        System.out.println(Double.parseDouble("100.3"));
        System.out.println(Float.parseFloat("200.3"));

        System.out.println(Integer.parseInt("50") + Integer.parseInt("100"));


    }




}
