package class_ex3.car;

public class Car0 { // Getter와 Setter
    // 필드
    private int speed;
    private boolean stop;

    // 생성자

    // 메소드
    public int getSpeed() { // get 필드안에 값을 가져옴
        return speed;
    }
    public void setSpeed(int speed) { // set 필드에 저장
        if(speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }
    public boolean isStop() { 
        // is.. = true or false 값을 반환받을때 사용
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
    
}
