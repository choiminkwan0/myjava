package class_ex3.calculator;

public class Computer0 extends Calculator0 { // 자식 클래스
    @Override 
    // 컴파일러에게 부모 클래스의 메소드 선언부와 동일한지 검사 지시
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
    
}
/* 메소드 재정의 효과
    - 부모 메소드는 숨겨짐
    - 재정의된 자식 메소드 실행
 */