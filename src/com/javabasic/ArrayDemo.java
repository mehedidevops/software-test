package com.javabasic;

public class ArrayDemo {


    public static void main(String[] args) {

        double [] salary = new double[10];
        salary[0]=2500.25;
        salary[1]=3500.25;

        System.out.println("Regular/Traditional Array: " + salary[1]);
        System.out.println(salary.length);

        String [] namess = new String[6];
        namess[0] = "Mehedi";
        namess[1] = "Shanta";
        namess[2] = "Nishat";
        namess[3] = "Mim";
        namess[4] = "Arif";
        namess[5] = "Helal";


        String [] names = {"Mehedi", "Nishat", "Shanta", "Mim", "Arif", "Helal"};
        System.out.println("See the location:  " + names[1]);


        double [] salari = {2500.25, 3500.25, 600.25};
        System.out.println("Modern Array: " + salari[1]);
        System.out.println(salari.length);

//        int[] ab = new int[6];
//        ab[0] = 1;
//        ab[1] = 7;
//        ab[2] = 200;
//        ab[3] = 50;
//        ab[4] = 32;
//        ab[5] = 1000;
//        ab[6] = 200;
//        ab[7] = 800;
        //System.out.println(ab[7]);
//
//        String[] bc = new String[5];
//        bc[0] = "Sabrina";
//        bc[1] = "Shanta";
//        bc[2] = "Nishat";
//        bc[3] = "Mehedi";
//        bc[4] = "Mim";

        //System.out.println(bc[3]);

       //modern way array:
        int[] abcd = {1,7,200,50,32,100,500,800,600};//length = 7(abcd[6])
        System.out.println(abcd[8]);
//
//        String[] bcde = {"Sabrina","Shanta","Nishat","Mehedi","Mim"};//Length 5
//        System.out.println(bcde[5]);



    }
}
