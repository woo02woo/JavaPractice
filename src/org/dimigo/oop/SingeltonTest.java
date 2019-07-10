package org.dimigo.oop;

public class SingeltonTest {
    public static void main(String[] args) {
       // Singleton s = new Singleton();
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
    }
}
