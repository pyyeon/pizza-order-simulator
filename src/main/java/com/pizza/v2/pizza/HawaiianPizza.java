package com.pizza.v2.pizza;

public class HawaiianPizza implements Pizza {
    @Override
    public String getName() {
        return "하와이안";
    }

    @Override
    public int getPrice() {
        return 13000;
    }



}
