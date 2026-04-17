package class_ex4.animal.animal1;

import class_ex4.animal.animal2.Cat;
import class_ex4.animal.animal2.Dog;

public class AnimalEx { // 추상 클래스

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");

        // 변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");

        // 매개변수의 자동 타입 변환
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
    
}
