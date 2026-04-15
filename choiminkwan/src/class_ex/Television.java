package class_ex;

public class Television { // 정적 초기화 블록 
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    } // 클래스가 메소드 영역으로 로딜될 때 자동으로 실행
    
}
