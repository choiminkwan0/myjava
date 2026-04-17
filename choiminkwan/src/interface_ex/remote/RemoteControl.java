package interface_ex.remote;

public interface RemoteControl {
    // interface는 생성자가 없다

    /* 인터페이스는 상수 필드만 선언 가능, 데이터 저장x
    인터페이스에 선언된 필드는 모두 public static final이
    자동적으로 컴파일 과정에서 붙음 */
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0; // 상수명은 대문자로 작성

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 헤제합니다.");
        }
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
    
}
/* 추상 메소드의 처리부를 모두 만들어야 구현 클래스가 됨 
하나라도 빼먹으면 추상 클래스
*/
