package class_ex;

public class Korean { // 필드 초기화
    // 초기값 없이 선언된 필드는 객체가 생성될 때 기본값으로 자동 설정
    String nation = "대한민국"; // 명시적 초기화
    String name; // 생성자를 통한 초기화
    String ssn;

    // 생성자
    /* public Korean(String n, String s) {
        .name = name;
        .ssn = ssn;
    } */

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    } // this. = new 예약어로 생성자를 호출 할때마다 주소가 달라짐
    
}
