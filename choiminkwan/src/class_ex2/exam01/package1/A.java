package class_ex2.exam01.package1;
// 패키지는 반드시 1행에

public class A { // 접근 제한자
    // 필드
    public int field1; // 모든 외부 클래스에 접근 가능
    int field2; // 기본 값 default 다른 패키지에 접근 불가능
    private int field3; // 모든 외부 클래스에 접근 불가능

    // 생성자
    public A() {
        field1 = 1; // public
        field2 = 1; // default
        field3 = 1; // private

        method1(); // public
        method2(); // default
        method3(); // private
    }

    // 메소드
    public void method1 () {} // public
    void method2 () {} // default
    private void method3 () {} // private
}
