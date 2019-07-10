package org.dimigo.inheritence;

public class Persontest {
    public static void main(String[] args) {
        Person p = new Person("허정우",18,180,60);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("손강민",18,125,100,"2415");
        System.out.println(s);
        s.exam();
        s.study();


        Teacher t = new Teacher("지은혜",28,160,50,"컴네");
        System.out.println(t);
        t.dotask();
        t.teach();
    }
}
