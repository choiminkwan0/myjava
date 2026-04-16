package class_ex3.calculator;

public class Computer0Ex { // 활용 클래스
    public static void main(String[] args) {
        int r = 10;
        Calculator0 calculator0 = new Calculator0();
        System.out.println("원면적: " + calculator0.areaCircle(r));
        System.out.println();
        Computer0 computer0 = new Computer0();
        System.out.println("원면적: " + computer0.areaCircle(r));
    }
    
}
