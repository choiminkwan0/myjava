package portfolio;

import java.util.Scanner;

public class Portfolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.도서 등록");
        System.out.println("2.도서 목록 조회");
        System.out.println("3.저장 및 종료");
        System.out.print("메뉴 선택 >> ");
        String str = scanner.nextLine();
        int x = Integer.parseInt(str);

        if(x == 1) {
            Scanner scin1 = new Scanner(System.in);
            System.out.print("ID: ");
            String id = scin1.nextLine();
            System.out.print("제목: ");
            String title = scin1.nextLine();
            System.out.print("저자: ");
            String author = scin1.nextLine();
            System.out.println("결과: 성공적으로 등록되었습니다.");
            System.out.println("================================");

        } else if(x == 2) {
            System.out.println(str);
        } else if(x == 3) {
            System.out.println(str);
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }
    }
    
}
