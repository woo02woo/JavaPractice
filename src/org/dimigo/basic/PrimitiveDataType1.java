package org.dimigo.basic;

public class PrimitiveDataType1 {
    static boolean flag;//전역변수는 초기화시키지 않아도 됨 false 값이 들어감.
    public static void main(String[] args) {
        //1.논리형
        // boolean flag = true; 지역변수일때는 반드시 초기화시켜야됨.

        // flag가 참이면 참입니다 거짓이면 거짓입니다 출력
        if(flag == true)
            System.out.println("참입니다!");
        else
            System.out.println("거짓입니다!");

        System.out.println(flag ? "참입니다" : "거짓입니다");

        //2.문자형
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.printf("%c, %c, %c\n",c1,c2,c3);

        //3.문자열
        String name = "허정우";
        System.out.println("My name is"+ name);

        //4.정수형
        int i1 =10;
        int i2 =0b00001010;
        int i3 =012;
        int i4 = 0x0A;
        System.out.printf("%d,%d,%d,%d\n",i1,i2,i3,i4);

        //byte (-128 ~ 127 까지의 수 표현 가능)
        byte b1 = -128;
        byte b2 = 127;

        b1--; //최솟값에서 1을 빼면 최댓값 즉 127이 나온다
        b2++; // 최댓값에서 1을 더하면 최솟값 즉 -128이 나온다

        System.out.println(b1);
        System.out.println(b2);

        //정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

        //문제: 100억을 저장하려면
        long l1 = 10000000000L;

        //5.실수형
        float f1 = 3.14f;
        double d1 = 3.14;

        //실수 정밀도 테스트
        float f2 =0.12345678901234567890f;
        double d2 =0.12345678901234567890;
        System.out.println(f2);
        System.out.println(d2);

        //
        System.out.printf("%c,%d,%.2f,%s\n",'A',100,12.345,"허정우짱");


    }
}
