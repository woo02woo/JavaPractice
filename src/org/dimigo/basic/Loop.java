package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //1. for문
        //구구단 출력
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.printf("%dx%d=%d ",i,j,i*j);

            }
            System.out.printf("\n");
        }
//for each 문
        int[] arr = {1,2,3,4,5};
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        for(int a :arr){
            System.out.println(a);
        }


        String[] RedVelvet = {"아이린","조이","슬기","웬디","예리"};
        for(String a :RedVelvet){
            System.out.println(a);
        }

        //3. while do while문
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do{
            System.out.println("<<아이돌 선택>>");
            System.out.println("1.ITZY");
            System.out.println("2.프로미스나인");
            System.out.println("3.레드벨벳");
            System.out.println("9.종료");
            System.out.print("메뉴 선택 =>");

            menu = scanner.nextInt();
            //menu 1을 입력하면 "ITZY를 선택하셨네요"
            //menu 2을 입력하면 "빅뱅을 선택하셨네요"  등등
            switch (menu){
                case 1:
                    System.out.println("ITZY를 선택하셨네요");
                    break;
                case 2:
                    System.out.println("프로미스나인을 선택하셨네요");
                    break;
                case 3:
                    System.out.println("레드벨벳을 선택하셨네요");
                    break;
                case 9:
                    System.out.println("BYE!");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는메뉴네요");
                    break;

            }

        }while(menu != 9);
    }



}

