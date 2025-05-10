package com.pizza.v2;

import com.pizza.v2.pizza.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         Pizza pizza ;
         //피자종류를 뉴 클래스로 배열로 묶어도 될듯.
        System.out.println("메뉴:");
        System.out.println("1. 마르게리타 - 10000원 ");
        System.out.println("2. 페퍼로니 - 12000원 ");
        System.out.println("3. 하와이안 - 13000원 ");

        //입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("주문할 피자를 선택하세요: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            pizza = new MargheritaPizza();

        } else if (choice == 2) {
            pizza = new PepperoniPizza();

        }else if (choice == 3){
            pizza = new HawaiianPizza();
        }else {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println(pizza.getName() + "을 주문하셨습니다");
        System.out.println("가격은 " + pizza.getPrice() + "원입니다.");


    }
}
