package class_ex;

public class Calculator_03 { // 오버로딩

    int plus(int x, int y) {
        return x + y;
    }

    double plus(double x, int y) {
        return x + y;
    }

    double plus(double x, double y) {
        return x + y;
    }

    double plus(int x, double y) {
        return x + y;
    }
    
}
/* 메소드 오버로딩
    - 클래스 내에 같은 이름의 메소드를 여러 개 선언
    - 하나의 메소드 이름으로 다양한 매개값 받기 위해 메소드 오버로딩
    - 오버로딩 조건: 매개변수의 타입, 개수, 순서가 달라야함
 */