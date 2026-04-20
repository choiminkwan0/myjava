package exception_ex;

public class CatchOrderEx {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException e) { // e 예외 객체 생성
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch(Exception e) { 
            // Exception 항상 하위쪽에 넣기, 모든 Exception을 잡음
            System.out.println("실행에 문제가 있습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        } // finally 실행때 반드시 실행시켜야하는 구문이 있을때만
        
    }
    
}
