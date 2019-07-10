package org.dimigo.basic;

public class Operator2groomtest {
    public static void main(String[] args) {
         int a=1700000;
         int people = 3;
         int store =1500;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n",a);
        System.out.printf("점포 내 직원 수 : %,d명\n",people);
        System.out.printf("점포 수 : %,d개\n\n",store);
        System.out.printf("연간 인건비 : %,d원",(long)a*12*people*store);




    }
}
