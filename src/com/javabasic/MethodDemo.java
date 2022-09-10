package com.javabasic;

public class MethodDemo {

    //method/functions 2 types: 1. void 2. return
    //void method
    int time=9;

    public void cook(){
        if (time == 12){
            System.out.println("Please cook the biryani");
        }else{
            System.out.println("Please cook the snacks");
        }

    }
    public void helloGoodMorning(){
        System.out.println("Hello Good Morning, Today was August 7th, 2022!");
    }

    public void helloGoodAfternoon(){
        System.out.println("Hello Good Afternoon, Today was August 7th, 2022!");
    }

    public void helloGoodEvening(){
        System.out.println("Hello Good Evening, Today was August 7th, 2022!");
    }


    //return method
    public String goodMorning(){
        return "Hello Good Morning, Today was August 7th, 2022!, its a month of Arabic calender Muharram 9th";
    }

    public int add(){
        return 2+2;
    }

    public double price(){
        return 1.2+2.3;
    }


}
