package com.pizza.v1;

import java.util.Scanner;


public class PizzaOrder {

    public static void main(String[] args) {
// 메뉴룰 보여주고 그 값에 따른 가격 출력.
        //메뉴 보여주기

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
            System.out.println("마르게리타 피자를 주문하셨습니다. 가격은 10000원입니다.");

        } else if (choice == 2) {
            System.out.println("페퍼로니 피자를 주문하셨습니다. 가격은 12000원입니다.");

        }else if (choice == 3){
            System.out.println("하와이안 피자를 주문하셨습니다. 가격은 13000원원입니다.");
        }else {
            System.out.println("잘못된 입력입니다.");
        }


    }

}
