package interface_ex.vehicle;

public class Bus implements Vehicle { // 매개변수의 다형성
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFare() {
        System.out.println("승차요금을 체크합니다.");
    }
    
}
