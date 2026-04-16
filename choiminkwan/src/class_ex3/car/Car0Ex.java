package class_ex3.car;

public class Car0Ex { // Getter와 Setter

    public static void main(String[] args) {
        Car0 myCar0 = new Car0();

        // 잘못된 속도 변경
        myCar0.setSpeed(-50);

        System.out.println
        ("현재 속도: " + myCar0.getSpeed());

        // 올바른 속도 변경
        myCar0.setSpeed(60);

        // 멈춤
        if(! myCar0.isStop()) { // is~ = true or false 값을 반환
            myCar0.setStop(true);
        }
        System.out.println
        ("현재 속도: " + myCar0.getSpeed());
        
    }
    
}
