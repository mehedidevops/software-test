package com.javabasic;

public class ExamplesOfScopeAcessVariables {

    public double price = 12;

    public void setPrice(double newPrice) {

        double fees = 10;
        price = newPrice + fees;

        if (price > 20) {
            double discount = 0.5;
            price = price - fees * discount;

        }

    }

    public double getPrice() {
        int shirt = 5;
        int fee = 12;
        price = price - shirt + fee;
        shirt = 10;
        return price;
    }


}
