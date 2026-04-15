package class_ex;

public class PersonEx { // final 필드 선언과 초기화

    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        /* p1.nation = "usa";
         p1.ssn = "654321-7654321"; */
        // final로 인해 값 변경이 되지 않음

        p1.name = "을지문덕";
        System.out.println(p1.name);
    }
    
}
