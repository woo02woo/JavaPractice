package org.dimigo.oop;


//1. 객체를 바로 만들기
public class Singleton {
    private static Singleton instance =new Singleton();


    //new 로 객체생성 못함
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }


    //2. lazy initialization
    public static Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }


}
