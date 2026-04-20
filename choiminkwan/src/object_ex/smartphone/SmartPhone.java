package object_ex.smartphone;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }
    @Override // extends Object가 자동 생략되어 빨간줄 없음
    public String toString() { // toString() 객체를 문자열로 표현한 값
        return company + "," + os;
    }
    
}
