package com.pizza.v3.pizza;

public class HawaiianPizza extends Pizza {

    @Override
    public String getName() {
        return "하와이안";
    }

    @Override
    public int getPrice() {
        return 13000;
    }

    @Override
    public void prepare(){
        System.out.println( "토마토 소스 + 페퍼로니를 올립니다.");
    }


}
