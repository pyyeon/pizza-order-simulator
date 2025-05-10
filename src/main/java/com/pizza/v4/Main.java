package com.pizza.v4;

import com.pizza.v3.pizza.*;


public class Main {

    public static void main(String[] args) {
        Pizza p1 = new MargheritaPizza();
        Pizza p2 = new HawaiianPizza();

        Thread t1 = new Thread(new PizzaOrderTask(p1, "p1"));
        Thread t2 = new Thread(new PizzaOrderTask(p2, "p2"));
        t1.start();
          // 1초 조리 시간 시뮬레이션
        t2.start();
    }


}
