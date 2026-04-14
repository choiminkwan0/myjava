public class Ex23 {

    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; // 2로 3번 곱한다
        int result2 = num1 * (int) Math.pow(2, 3);
        // Math.pow(a, b) a의 b제곱을 double로 반환하는 메소드
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >> 3; // 2로 3번 나눈다
        int result4 = num1 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
    
}
