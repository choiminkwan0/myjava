package exception_ex;

public class ThrowsEx {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) { // e 예외 객체 생성
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
    // throws 호출한 곳으로 떠 넘기기
    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
    
}
