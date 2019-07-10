package org.dimigo.oop2;

public class Person {
    public static final String TYPE= "포유류";
    private final String birthDate;
    private String name;

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;

    }

    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020817","허정우");
        Person p2 = new Person("20020129","장가빈");
        System.out.println(p1);
        System.out.println(p2);
       // p1.type = "파충류";
        System.out.println(Person.TYPE);




    }
}
