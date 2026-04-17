package class_ex4.animal.animal2;

import class_ex4.animal.animal1.Animal;

public class Cat extends Animal { // 추상 클래스
    public Cat() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
