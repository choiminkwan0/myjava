import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // in 입력

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine(); // nextLine 한줄 읽기
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();
        // println()안에 값이 없으면 줄바꿈을 하겠다는 뜻
        
        while(true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) { 
                break;
            } // equals 참조변수가 저장하고있는 주소안의 값을 비교
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }   
        
        System.out.println("종료");
    }
    
}