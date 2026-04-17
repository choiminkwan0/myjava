package interface_ex.tire;

public class CarEx { // 필드의 다형성
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontrightTire = new KumhoTire();
        
        System.out.println();
        myCar.run();
    }
    
}
