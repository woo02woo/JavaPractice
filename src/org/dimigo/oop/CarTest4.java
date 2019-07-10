package org.dimigo.oop;

public class CarTest4 {


    public static void main(String[] args) {
        Car4 car = new Car4("현대자동차","제네시스","검정색",225,50000000);
        Car4 car2 = new Car4("기아자동차","K7","흰색",246);
        Car4 car3 = new Car4("삼성자동차","SM7","회색");






        System.out.println("<< 자동차 목록 >>");
        System.out.printf("제조사명 : %s\n",car.getCompany());
        System.out.printf("모델명 : %s\n",car.getModel());
        System.out.printf("색상 : %s\n",car.getColor());
        System.out.printf("최대속도 : %dkm\n",car.getMaxspeed());
        System.out.printf("가격 : %,d원\n\n",car.getPrice());



        System.out.printf("제조사명 : %s\n",car2.getCompany());
        System.out.printf("모델명 : %s\n",car2.getModel());
        System.out.printf("색상 : %s\n",car2.getColor());
        System.out.printf("최대속도 : %dkm\n",car2.getMaxspeed());
        System.out.printf("가격 : %,d원\n\n",car2.getPrice());



        System.out.printf("제조사명 : %s\n",car3.getCompany());
        System.out.printf("모델명 : %s\n",car3.getModel());
        System.out.printf("색상 : %s\n",car3.getColor());
        System.out.printf("최대속도 : %dkm\n",car3.getMaxspeed());
        System.out.printf("가격 : %,d원",car3.getPrice());
    }
}
