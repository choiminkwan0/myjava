package class_ex;

public class ComputerEx { // 메소드 매개변수 선언

    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = new int[] {1, 2, 3};
        int result1 = myCom.sum1(values1);

        int[] values2 = new int[] {1, 2, 3, 4, 5};
        int result2 = myCom.sum1(values2);

        int result3 = myCom.sum2(values1);

        int result4 = myCom.sum2(values2);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
    
}   
