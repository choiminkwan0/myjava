package class_ex;

public class StudentEx { // 활용 클래스

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1 + "s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println(s2 + "s2 변수가 또 다른 Student 객체를 참조합니다.");
    } // 라이브러리 클래스 메모리에 점유된 주소가 나옴
    
}
