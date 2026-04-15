package class_ex;

public class Computer { // 메소드 매개변수 선언
    int sum1(int[] values) {
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) { // 가변변수
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    
}
