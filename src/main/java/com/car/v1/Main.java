package com.car.v1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //사용자에게 자동차 이름(쉼표로 구분)과 시도할 회수(정수)를 입력받는다.
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 자동차 이름을 입력하세요: ");
        String car1Nm = sc.nextLine();
        System.out.print("두번째 자동차 이름을 입력하세요: ");
        String car2Nm = sc.nextLine();
        System.out.print("세번째 자동차 이름을 입력하세요: ");
        String car3Nm = sc.nextLine();
        if (isSameNm(car1Nm, car2Nm, car3Nm)
                || isOverLetter(car1Nm)
                || isOverLetter(car2Nm)
                || isOverLetter(car3Nm)) {
            System.out.println("중복되거나 5자 초과된 이름은 불가합니다.");
            return;
        }

        System.out.print("시도할 회수는 몇 회인가요?");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("실행결과");
        int car1score = 0;
        int car2score = 0;
        int car3score = 0;
        for (int i = 0; i < num; i++) {
            //각 자동차는 매 회차마다 0~9 사이의 랜덤 값을 뽑는다.
            int randomNm1 = (int) (Math.random() * 10);
            int randomNm2 = (int) (Math.random() * 10);
            int randomNm3 = (int) (Math.random() * 10);
            //랜덤 값이 4 이상이면 자동차는 전진한다. 4 미만이면 정지.
            if (randomNm1 >= 4) car1score++;
            if (randomNm2 >= 4) car2score++;
            if (randomNm3 >= 4) car3score++;

            //회차별 자동차의 전진 결과를 출력한다.
            System.out.println(car1Nm + " : " + "-".repeat(car1score));
            System.out.println(car2Nm + " : " + "-".repeat(car2score));
            System.out.println(car3Nm + " : " + "-".repeat(car3score));
            System.out.println();  // 줄바꿈

        }


    }

    static boolean isOverLetter(String s) {
        return s.length() > 5;
    }

    static boolean isSameNm(String n, String a, String m) {
        return (n.equals(a) || a.equals(m) || m.equals(n));
    }

}