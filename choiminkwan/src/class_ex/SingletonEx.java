package class_ex;

public class SingletonEx { // 싱글톤

    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton(); // 컴파일 에러
        Singleton obj2 = new Singleton(); // 컴파일 에러
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체 입니다.");
        } else {
            System.out.println("다른 Singleton 객체 입니다.");
        }
    }
    
} /* 싱글톤 얻는 방법
        클래스 변수 1 = 클래스.getInstance();
        클래스 변수 2 = 클래스.getInstance(); */

