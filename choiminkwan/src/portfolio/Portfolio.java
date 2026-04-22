package portfolio;

import java.io.IOException;
import java.util.Scanner;

public class Portfolio {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Manageable manageable = new ManageableEx();
        while(true) {
            System.out.println("1.도서 등록");
            System.out.println("2.도서 목록 조회");
            System.out.println("3.저장 및 종료");
            System.out.print("메뉴 선택 >> ");
            String str = scanner.nextLine();
            int x = Integer.parseInt(str);
        
            if(x == 1) {
                System.out.println("[도서 등록]");
                Scanner scin1 = new Scanner(System.in);
                System.out.print("ID: ");
                int id = Integer.parseInt(scin1.nextLine());
                System.out.print("제목: ");
                String title = scin1.nextLine();
                System.out.print("저자: ");
                String author = scin1.nextLine();
                manageable.addItem(new Book(id, title, author));
                System.out.println("결과: 성공적으로 등록되었습니다.");
                System.out.println("================================");

            } else if(x == 2) {
                manageable.displayAll();
            } else if(x == 3) {
                manageable.saveToFile();
                System.out.println("프로그램을 종료합니다.");
                System.out.println("================================");
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다.");
                System.out.println("================================");
            }
        }
        scanner.close();
    }
    
}
