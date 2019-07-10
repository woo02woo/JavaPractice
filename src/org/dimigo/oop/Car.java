package org.dimigo.oop;


public class Car {


    private String company;
    private int price;
    private float fuelEfficiency;
    private String color;
    private String type;


    public void forward() {
        System.out.println("전진합니다!!");
    }


    public void backward() {
        System.out.println("후진합니다!!");
    }


    public boolean stop() {
        System.out.println("멈춥니다!!");
        return true;
    }

    public void turnright(int angle) {
        System.out.println(angle + "도 우회전합니다!!");
    }


    public void turnleft(int angle) {
        System.out.println(angle+"도 좌회전합니다!!");
    }

}