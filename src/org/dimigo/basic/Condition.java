package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // 1. if~else 문
        //선거권 연령:만 19세
        int age = 17;
        //나이가 만 19세 이상이면 "투표하러 가세요" 출력
        //아니면 "선거권이 없네요" 출력
        if (age >= 19) {
            System.out.println("투표하러 가세요");
        } else {
            System.out.println("선거권이 없네요");
        }

        //2. switch 문
        //주사위 랜덤 값 뽑기(1~6)
        System.out.println(new Random().nextInt(6) + 1);//객체만드는 방법
        int num = new Random().nextInt(6) + 1;

        //switch case 문으로 num이 짝수면 짝수입니다.홀수면 홀수입니다 둘 다 아니면 누구냐 넌 출력

        switch (num % 2) {
            case 0:
                System.out.println("짝수입니다");
                break;
            case 1:
                System.out.println("홀수입니다");
                break;
            default:
                System.out.println("누구냐 넌");
                break;
        }

        String menu = "치킨";
        switch (menu) {
            case "치킨":
                System.out.println("치킨 선택");
                break;
            case "피자":
                System.out.println("피자 선택");
                break;
            default:
                System.out.println("다이어트 중");
                break;
        }
    }
}
