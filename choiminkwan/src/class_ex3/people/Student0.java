package class_ex3.people;

public class Student0 extends People0 { // 자식 클래스

    // 필드
    public int studentNo;

    public Student0(String name, String ssn, int studentNo) {
        super(name, ssn); // 부모 생성자 호출
        // super 생성자에서 반드시 가장 첫번째 행에 넣어야함
        this.studentNo = studentNo;
        // this. = new 예약어로 생성자를 호출 할때마다 주소가 달라짐
    }
    
}
