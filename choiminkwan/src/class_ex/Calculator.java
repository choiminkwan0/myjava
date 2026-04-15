package class_ex;

public class Calculator {
    // 메소드
    void powerOn() { // void = 반환형, 반환할 값이 없다
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result; // return 값 전달, 메소드 종료
    }

    double divide(int x, int y) {
        double result = (double)x / y;
        return result;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    
}
