package interface_ex.interface_0;

public class ImplementationC implements InterfaceC {
    // 인터페이스 상속
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }

    public void methodB() {
        System.out.println("ImplementationC-methodB() 실행");
    }

    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");
    }
    
}
// 하위 인터페이스 구현 클래스는 추상 메소드를 모두 재정의 해야함
