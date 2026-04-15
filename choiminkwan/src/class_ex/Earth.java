package class_ex;

public class Earth { // 상수(static final) 선언

    // 정적 final 필드
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA; 
    // 상수 이름은 모두 대문자
    // 다른 단어가 결합되면 _로 연결

    static {
        EARTH_SURFACE_AREA = 
        4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
    
} /* 상수(static final)
    - 객체마다 가지고 있지 않음
    - 메소드 영역에 클래스 별로 관리되는 정적 필드
    - 공용 데이터로 사용 */ 
