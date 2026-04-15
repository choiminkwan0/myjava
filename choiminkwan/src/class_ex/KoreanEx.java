package class_ex;

public class KoreanEx { // 필드 초기화

    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011225-1234567");
        System.out.println("k1.name: " + k1.name);
        System.out.println("k1.ssn" + k1.ssn);

        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println("k1.name: " + k2.name);
        System.out.println("k1.ssn" + k2.ssn);
    } // 참조변수를 통해 항상 객체안에 값을 호출해서 사용 가능
    
}
