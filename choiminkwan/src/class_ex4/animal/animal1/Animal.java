package class_ex4.animal.animal1;

public abstract class Animal { // 추상 클래스
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
    public abstract void sound();
    
}
/* 추상클래스 클래스 선언에 abstract 키워드 사용
    - 자식을 통해 객체가 생성되는 클래스
    - new 연산자로 객체 생성x
    - 처리부가 없고 선언부만 있게 */