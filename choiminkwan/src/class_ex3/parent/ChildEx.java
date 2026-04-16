package class_ex3.parent;

public class ChildEx {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();

        parent.method2();

        // parent.method3(); (호출 불가능)
    }
    
}
/* 자동 타입 변환
    - 바로 위의 부모가 아니더라도 상속 계층의 상위면 가능
    - 변환 후에는 부모 클래스 멤버만 접근 가능
 */
