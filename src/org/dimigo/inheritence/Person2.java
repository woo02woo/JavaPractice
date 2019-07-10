package org.dimigo.inheritence;

public class Person2 {
    private String name;

    public Person2() {
    }

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public void sayBye(){
        System.out.println("Bye");
    }

    @Override
    public String toString() {
        return "저는 " + name +"입니다.";
    }
}

