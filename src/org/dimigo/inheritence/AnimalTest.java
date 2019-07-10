package org.dimigo.inheritence;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("동물"),
                new Dog("멍멍이"),
                new Cat("냥냥이"),
                new Tiger("호돌이")
        };
        for(Animal a :animals) {
            doAction(a);
        }

        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        //dog.wag(); 오류


        //Dog dog2 = (Dog)dog;
       // dog2.wag();
        ((Dog) dog).wag();

        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Object);

    }
    private  static void doAction(Animal a){
        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.scratch();
        }
        else if(a instanceof Dog){
            ((Dog) a).wag();
        }
    }
}
