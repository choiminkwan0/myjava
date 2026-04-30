package oracle2.project.administrator.bookcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookUpdate {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // JDBC Driver 등록
            Class.forName("oracle.jdbc.OracleDriver");

            // 연결하기
            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "1234"
            );
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- 도서업데이트 ---");
            System.out.print("도서번호: ");
            int pk = Integer.parseInt(scanner.nextLine());
            System.out.print("고유번호: ");
            int isbn = Integer.parseInt(scanner.nextLine());
            System.out.print("도서명: ");
            String name = scanner.nextLine();
            System.out.print("저자: ");
            String author = scanner.nextLine();
            System.out.print("출판사: ");
            String publisher = scanner.nextLine();
            System.out.print("대여가능여부: ");
            String rental = scanner.nextLine();

            String sql = new StringBuilder()
            .append("UPDATE BOOK_TABLE SET ")
            .append("ISBN=?, ")
            .append("BOOK_NAME=?, ")
            .append("AUTHOR=?, ")
            .append("PUBLISHER=?, ")
            .append("BOOK_RENTAL=? ")
            .append("WHERE BOOK_PK=?")
            .toString();

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, isbn);
            pstmt.setString(2, name);
            pstmt.setString(3, author);
            pstmt.setString(4, publisher);
            pstmt.setString(5, rental);
            pstmt.setInt(6, pk);

            int rows = pstmt.executeUpdate();
            System.out.println("수정된 도서: " + rows);
            scanner.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    // 연결 끊기
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
