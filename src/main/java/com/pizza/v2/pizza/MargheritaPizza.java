package com.pizza.v2.pizza;

public class MargheritaPizza implements Pizza {

    private String name = "마르게리타";

    private  int price = 10000;

    @Override
    public String getName(){
        return  name;
    }
    @Override
    public int getPrice(){
        return  price;
    }


}
