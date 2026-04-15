package class_ex;

public class Calculator_04 { // 정적 멤버 사용
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x+y;
    }

    static int minus(int x, int y) {
        return x-y;
    }
    
}
/* 정적 멤버 = 클래스에 고정된 필드와 메소드(정적 필드, 정적 메소드)
    - 객체 내부에 존재하지 않고 메소드 영역에 존재
    - 정적 멤버는 객체를 생성하지 않고 클래스로 바로 접근해 사용
 */
