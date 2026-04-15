package class_ex;

public class Person { // final 필드 선언과 초기화
    
    // final 초기화한 값을 값 변경을 하지 않음
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
    
}
