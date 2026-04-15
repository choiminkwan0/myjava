package class_ex;

public class Calculator_04Ex { // 정적 멤버 사용

    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator_04.pi;
        int result2 = Calculator_04.plus(10, 5);
        int result3 = Calculator_04.minus(10, 5);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
    
}
