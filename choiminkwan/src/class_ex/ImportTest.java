package class_ex;

import java.text.*;
import java.util.*;
// 사용할 클래스가 속한 패키지를 지정하는데 사용
// import문을 사용하면 클래스를 사용할 때 패키지명을 생략할 수 있다.
// java.lang패키지의 클래스는 import하지 않고도 사용 가능
// import문은 패키지문과 클래스선언의 사이에 선언

public class ImportTest { // import문의 선언
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
    
}
