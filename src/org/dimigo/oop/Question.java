package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        String[] question= {"가장 좋아하는 가수는? ","가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
        String[] answers = {"프로미스나인","김향기","체육"};
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        int num =0;

        do {

            System.out.println("--------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------------");
            System.out.printf("메뉴 선택 => ");

            menu = scanner.nextInt();
            switch(menu) {
                case 1:
                    num = new Random().nextInt(3);
                    System.out.printf(question[num]);
                    String answer = scanner.next();
                    if(answer.equals(answers[num])){
                        System.out.println("정답입니다!");
                    }
                    else
                        System.out.println("틀렸습니다");
                    break;
                case 2:
                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<3;i++){
                        sb.append(question[i]).append(answers[i]).append("입니다.\n");
                    }
                    System.out.println("<< 정답 출력 >>");
                    System.out.println(sb);
                    break;
                case 9:
                    System.out.println("Bye~");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        }while(menu != 9);
    }
}
