package com.pizza.v3.pizza;

public class MargheritaPizza extends Pizza {

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

    @Override
    public void prepare(){
        System.out.println( "토마토 소스를 바릅니다.");
    }


}
