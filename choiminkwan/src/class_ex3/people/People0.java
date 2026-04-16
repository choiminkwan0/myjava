package class_ex3.people;

public class People0 { // 부모 클래스

    // 필드 
    public String name;
    public String ssn;

    // 생성자
    public People0(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
        // this. = new 예약어로 생성자를 호출 할때마다 주소가 달라짐
    }
    
}
