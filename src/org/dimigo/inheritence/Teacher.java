package org.dimigo.inheritence;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name,int age,int height,int weight,String subject) {
        super(name,age,height,weight);// super 먼저 호출하기
        this.subject = subject;
    }
    public Teacher(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }

    public void teach(){
        System.out.println(getName()+"쌤이 공부를 가르칩니다.");

    }
    public void dotask(){
        System.out.println(getName() +"쌤이 일을 합니다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
               super.toString();
    }
}
