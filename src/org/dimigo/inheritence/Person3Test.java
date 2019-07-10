package org.dimigo.inheritence;

public class Person3Test {


    public static void main(String[] args) {
        Person2[] persons = {
                new Person2("tom"),
            new Korean("홍길동"),
            new Japanese("다나카"),
            new Chinese("왕밍")
        };


        for(Person2 p : persons){
          greeting(p);
        }


    }
    private static void greeting(Person2 a){
        System.out.println(a);
        a.sayHello();
        a.sayBye();
    }


}
