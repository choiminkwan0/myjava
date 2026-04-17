package class_ex4.tire.tire2;

public class KumhoTire extends Tire {

    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation); // 상위 생성자 호출
    }

    @Override // 메소드 재정의
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + "KumhoTire 수명: "
            + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + 
            "KumhoTire 펑크 ***");
            return false;
        }
    }
    
}
