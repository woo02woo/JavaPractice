package org.dimigo.oop;

public class Calculator {
    //인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerFlag;

    //생성자
    public Calculator() {

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //인스턴스 메소드  static이 없ㄴ는 메소드 객체가 있을때 사용할 수 있는것
    public void powerOn() {
        if (!this.powerFlag) {
            System.out.println("전원을 켭니다");
            this.powerFlag = true;
        }

    }

    public void powerOff() {
        if(powerFlag){
            System.out.println("전원을 끕니다");
            powerFlag = false;
        }

    }

    public int add() {
            this.powerOn();
            return this.num1 + this.num2;
        }
        public int sub () {
            this.powerOn();
            return this.num1 - this.num2;
        }
        public int mul () {
            this.powerOn();
            return this.num1 * this.num2;
        }
        public double div () {
            this.powerOn();
            return (double) this.num1 / this.num2;
        }
    }

