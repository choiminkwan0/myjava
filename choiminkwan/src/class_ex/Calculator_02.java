package class_ex;

public class Calculator_02 { // 클래스 내부에서 메소드 호출
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행결과: " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
    
}
/* 메소드 호출
    클래스 내부: 메소드 이름으로 호출
    클래스 외부: 객체 생성 후 참조변수를 이용해 호출
 */
