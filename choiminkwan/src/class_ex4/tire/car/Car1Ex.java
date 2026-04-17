package class_ex4.tire.car;

import class_ex4.tire.tire2.HankookTire;

public class Car1Ex {
    public static void main(String[] args) {
        Car1 car = new Car1();

        for(int i=1; i<5; i++) {
            int problemLocation = car.run();
            switch(problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞왼쪽 KumhoTire로 교체");
                    car.frontRightTire = new HankookTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("앞왼쪽 KumhoTire로 교체");
                    car.backRightTire = new HankookTire("뒤오른쪽", 17);
                    break;
            }
        }
    }
    
}
