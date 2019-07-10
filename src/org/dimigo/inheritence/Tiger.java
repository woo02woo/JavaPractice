package org.dimigo.inheritence;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("어흥");
    }

    public void hunt(){
        System.out.println(name + "이 사냥을 한다.");
    }
}
