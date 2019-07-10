package org.dimigo.interfaces;


//인터페이스: 하나의 표준,규약,명세
public interface IAnimal {
    //필드 무조건 상수 처리(public static final) 자동으로 상수 처리됨
    String FARM_NAME = "디미 동물농장";




    //추상메소드 선언 추상메소드만 선언 가능
    //public abstract void eat();
    void bark(); // public abstract 가 자동으로 붙음 인터페이스의 메소드는 모두 추상메소드이므로


    //JDK 8부터 추가 디폴트 메소드를 추가하여 추상메소드만 쓸 수 있지만 구현부를 만들 수 있음
    default void eat() {
        System.out.println("냠냠");
    }

    //정적 메소드도 추가하여 넣을 수 있음
    public static void welcome(){
        System.out.println(FARM_NAME+ "에 오신 것을 환영합니다 ");
    }

}
