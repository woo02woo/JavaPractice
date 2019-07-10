package org.dimigo.oop;

public class CarTest3 {


    public static void main(String[] args) {
        Car3 car = new Car3("현대자동차","제네시스","검정색",225,50000000);
        Car3 car2 = new Car3("기아자동차","K7","흰색",246,40000000);
        Car3 car3 = new Car3("삼성자동차","SM7","회색",200,38000000);






        System.out.println("<< 자동차 목록 >>");
        System.out.printf("제조사명 : %s\n",car.getCompany());
        System.out.printf("모델명 : %s\n",car.getModel());
        System.out.printf("색상 : %s\n",car.getColor());
        System.out.printf("최대속도 : %dkm\n",car.getMaxSpeed());
        System.out.printf("가격 : %,d원\n\n",car.getPrice());



        System.out.printf("제조사명 : %s\n",car2.getCompany());
        System.out.printf("모델명 : %s\n",car2.getModel());
        System.out.printf("색상 : %s\n",car2.getColor());
        System.out.printf("최대속도 : %dkm\n",car2.getMaxSpeed());
        System.out.printf("가격 : %,d원\n\n",car2.getPrice());



        System.out.printf("제조사명 : %s\n",car3.getCompany());
        System.out.printf("모델명 : %s\n",car3.getModel());
        System.out.printf("색상 : %s\n",car3.getColor());
        System.out.printf("최대속도 : %dkm\n",car3.getMaxSpeed());
        System.out.printf("가격 : %,d원",car3.getPrice());
    }
}
