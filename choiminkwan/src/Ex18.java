import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("x값: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값: ");
        String strY = scanner.nextLine();
        double y = Double.parseDouble(strY);

        double z = x / y;

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));

        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
    
}
