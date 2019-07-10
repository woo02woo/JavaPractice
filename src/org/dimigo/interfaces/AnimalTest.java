package org.dimigo.interfaces;


public class AnimalTest {
    public static void main(String[] args) {
        IAnimal[] animals = {
                new Duck(),new Pig(),new Cow()
        };
        IAnimal.welcome();
        System.out.println("=== 평온한 동물농장 ===");
        for(IAnimal a :animals){
            a.eat();
        }
        System.out.println("=== 늑대가 나타났다 ===");
        for(IAnimal a : animals){
            a.bark();
        }
        //IAnimal.FARM_NAME = "디미고"; 상수라서 값을 바꾸지 못함
    }
}
