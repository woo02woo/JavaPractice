package org.dimigo.inheritence;

public class Korean extends Person2{
    public Korean(String name) {
        super(name);
    }
    public void sayHello(){
        System.out.println("안녕하세요");
    }
    public void sayBye(){
        System.out.println("안녕히 계세요");
    }

    @Override
    public String toString() {
        return "저는 한국사람 "+getName()+"입니다.";
    }
}
