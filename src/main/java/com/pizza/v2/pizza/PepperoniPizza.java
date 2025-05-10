package com.pizza.v2.pizza;

public class PepperoniPizza implements Pizza {

    @Override
    public String getName() {
        return "페페로니 피자";
    }

    @Override
    public int getPrice() {
        return 12000;
    }
}
