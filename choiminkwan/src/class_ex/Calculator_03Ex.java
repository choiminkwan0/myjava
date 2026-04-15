package class_ex;

public class Calculator_03Ex {  // 오버로딩

    public static void main(String[] args) {
        Calculator_03 myCalcu = new Calculator_03();
        
        int result1 = myCalcu.plus(1, 1);
        System.out.println("result1: " + result1);

        double result2 = myCalcu.plus(0.5, 1);
        System.out.println("result2: " + result2);

        double result3 = myCalcu.plus(0.5, 1.5);
        System.out.println("result3: " + result3);

        double result4 = myCalcu.plus(0, 1.5);
        System.out.println("result3: " + result4);
    }
    
}
