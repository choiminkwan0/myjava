package class_ex4.parent;

public class InstanceofEx {
    public static void method1(Parent parent) {
        if(parent instanceof Child) { // 유효성 검사
            // if(객체(부모) instanceof 타입(자식))
            // parent 매개변수가 참조하는 객체가 Child인지 조사
            Child child = (Child) parent; // 타입 변환
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent; // 강제 타입 변환
        // 자식클래스 변수 = (자식클래스) 부모클래스타입;
        System.out.println("method2 - Child로 변환 성공");
    }


    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);

        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB); // 예외 발생
    }
    
}
