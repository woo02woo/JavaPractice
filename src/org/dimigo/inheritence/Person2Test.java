package org.dimigo.inheritence;

public class Person2Test {
    public static void main(String[] args) {
        Person2 p =new Person2("Tom");
        Person2 k = new Korean("홍길동");
        Person2 j = new Japanese("다나카");
        Person2 c = new Chinese("왕밍");

        //하나의 동일한 타입이므로 배열로 간단히 처리할 수 있다.
        System.out.println(p);
        System.out.println(k);
        System.out.println(j);
        System.out.println(c);
        System.out.println("");

        p.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();
        System.out.println("");
        p.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();


    }
}
