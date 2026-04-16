package class_ex3.airplane;

public class SupersonicAirplaneEx { // 활용 클래스
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
       
        sa.land();
    }
    
}
