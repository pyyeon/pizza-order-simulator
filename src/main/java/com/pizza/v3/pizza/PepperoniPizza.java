package com.pizza.v3.pizza;

public class PepperoniPizza extends Pizza {

    @Override
    public String getName() {
        return "페페로니";
    }

    @Override
    public int getPrice() {
        return 12000;
    }

    @Override
    public void prepare(){
        System.out.println("토마토 소스 + 페퍼로니를 올립니다.");
    }
}
