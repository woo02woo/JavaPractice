package org.dimigo.oop;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        Car2 car2 = new Car2();
        Car2 car3 = new Car2();

        car.setCompany("현대자동차");
        car.setModel("제네시스");
        car.setColor("검정색");
        car.setMaxspeed(225);
        car.setPrice(50000000);
        System.out.println("<< 자동차 목록 >>");
        System.out.printf("제조사명 : %s\n",car.getCompany());
        System.out.printf("모델명 : %s\n",car.getModel());
        System.out.printf("색상 : %s\n",car.getColor());
        System.out.printf("최대속도 : %dkm\n",car.getMaxspeed());
        System.out.printf("가격 : %,d원\n\n",car.getPrice());

        car2.setCompany("기아자동차");
        car2.setModel("K7");
        car2.setColor("흰색");
        car2.setMaxspeed(246);
        car2.setPrice(40000000);

        System.out.printf("제조사명 : %s\n",car2.getCompany());
        System.out.printf("모델명 : %s\n",car2.getModel());
        System.out.printf("색상 : %s\n",car2.getColor());
        System.out.printf("최대속도 : %dkm\n",car2.getMaxspeed());
        System.out.printf("가격 : %,d원\n\n",car2.getPrice());

        car3.setCompany("삼성자동차");
        car3.setModel("SM7");
        car3.setColor("회색");
        car3.setMaxspeed(200);
        car3.setPrice(38000000);

        System.out.printf("제조사명 : %s\n",car3.getCompany());
        System.out.printf("모델명 : %s\n",car3.getModel());
        System.out.printf("색상 : %s\n",car3.getColor());
        System.out.printf("최대속도 : %dkm\n",car3.getMaxspeed());
        System.out.printf("가격 : %,d원",car3.getPrice());
    }
}
