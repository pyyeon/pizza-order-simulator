package com.pizza.v4;
import com.pizza.v3.pizza.*;

public class PizzaOrderTask implements Runnable {
   private Pizza pizza;
   private String name;

    public PizzaOrderTask(Pizza pizza, String name){
        this.pizza = pizza;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ": " + pizza.getName() + " 피자 준비중...");
        pizza.prepare();
        try {
            Thread.sleep(pizza.getName().equals("마르게리타")  ? 1000:2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" 피자가 완성 됐습니다!");
    }
}
