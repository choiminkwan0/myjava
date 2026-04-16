package class_ex3.airplane;

public class SupersonicAirplane extends Airplane { // 자식 클래스
    public static final int NORMAL = 1; // 상수 선언
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속비행합니다.");
        } else {
            // Airplane 객체의 fly() 메소드 호출
            super.fly(); 
            // super 부모 객체 참조
            // this 자신 객체 참조
        }
    }
    
}
