import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.print("+, -, *, /를 선택하세요: ");
        String data = scanner.nextLine();
        
        if(data.equals("+")) {
        System.out.print("첫번째 수 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("두번째 수 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        }
            else if (data.equals("-")) {
            System.out.print("첫번째 수 입력: ");
            String strX = scanner.nextLine();
            int x = Integer.parseInt(strX);

            System.out.print("두번째 수 입력: ");
            String strY = scanner.nextLine();
            int y = Integer.parseInt(strY);

            int result = x - y;
            System.out.println("x - y: "+ result);
            }
           
            else if (data.equals("*")) {
            System.out.print("첫번째 수 입력: ");
            String strX = scanner.nextLine();
            int x = Integer.parseInt(strX);
    
            System.out.print("두번째 수 입력: ");
            String strY = scanner.nextLine();
            int y = Integer.parseInt(strY);

            int result = x * y;
            System.out.println("x * y: "+ result);
            }
            
            else if (data.equals("/")) {
            System.out.print("첫번째 수 입력: ");
            String strX = scanner.nextLine();
            Double x = Double.parseDouble(strX);
    
            System.out.print("두번째 수 입력: ");
            String strY = scanner.nextLine();
            Double y = Double.parseDouble(strY);

            Double result = x / y;
            System.out.println("x / y: "+ result);
            }

            else if (data.equals("q")) {
                System.out.println("종료");
                break;
            }
            
            else {
                System.out.println("잘못 입력 하셨습니다.");
                System.out.println();
            }
        }
            
    }
}