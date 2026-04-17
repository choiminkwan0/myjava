package interface_ex.vehicle;

public class Taxi implements Vehicle { // 매개변수의 다형성
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
