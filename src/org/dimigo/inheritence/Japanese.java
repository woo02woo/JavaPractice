package org.dimigo.inheritence;

public class Japanese extends Person2{
    public Japanese(String name) {
        super(name);
    }
    public void sayHello(){
        System.out.println("오하이요");
    }
    public void sayBye(){
        System.out.println("사요나라");
    }

    @Override
    public String toString() {
        return "저는 일본사람 "+getName()+"입니다.";
    }
}
