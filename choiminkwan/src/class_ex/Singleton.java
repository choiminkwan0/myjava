package class_ex;

public class Singleton { // 싱글톤
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
    
}
/* 싱글톤 = 하나의 애플리케이션 내 단 하나만 생성되는 객체
    
    싱글톤을 만드는 방법
    - 외부에서 new 연산자로 생성자를 호출할 수 없도록 막기
        private 접근 제한자를 생성자 앞에 붙임
    
    - 클래스 자신의 타입으로 정적 필드 선언
        자신의 객체를 생성해 초기화
        private 접근 제한자를 붙여 외부에서 필드 값 변경을 불가하도록
    
    - 외부에서 호출할 수 있는 정적 메소드 getInstance() 선언
        정적 필드에서 참조하고 있는 자신의 객체 return
 */
