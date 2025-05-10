package com.pizza.v3;
import com.pizza.v3.pizza.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pizza pizza;
        //피자종류를 뉴 클래스로 배열로 묶어도 될듯.
        System.out.println("메뉴:");
        Pizza[] menu = {
                new MargheritaPizza(),
                new PepperoniPizza(),
                new HawaiianPizza()
        };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i].getName() + " - " + menu[i].getPrice() + "원");
        }
        //입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("주문할 피자를 선택하세요: ");
        int choice = sc.nextInt();
        sc.nextLine();

        pizza = switch (choice) {
            case 1 -> new MargheritaPizza();
            case 2 -> new PepperoniPizza();
            case 3 -> new HawaiianPizza();
            default -> null;
        };

        if (pizza == null){
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println(pizza.getName() + "피자를 주문하셨습니다");
        pizza.prepare();
        System.out.println("가격은 " + pizza.getPrice() + "원입니다.");


    }
}
