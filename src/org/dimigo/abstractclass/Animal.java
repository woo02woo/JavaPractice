package org.dimigo.abstractclass;

public abstract class Animal {
    public void eat(){
        System.out.println("냠냠!!");
    }
    //추상메소드 : 자식클래스에서 반드시 오버라이딩하라!! < 구현부가 없음 >
    public abstract void bark();
}
