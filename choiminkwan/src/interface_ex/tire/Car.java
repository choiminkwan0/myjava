package interface_ex.tire;

public class Car { // 필드의 다형성
    Tire frontLeftTire = new HankookTire();
    Tire frontrightTire = new HankookTire();
    Tire backLeftTire = new KumhoTire();
    Tire backrightTire = new KumhoTire();

    void run() {
        frontLeftTire.roll();
        frontrightTire.roll();
        backLeftTire.roll();
        backrightTire.roll();
    }
    
}
