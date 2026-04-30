package oracle2.project.rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class BookReturn {
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

            System.out.println("--- 도서 반납 처리 ---");
            System.out.print("회원 아이디: ");
            String user = scanner.nextLine();
            System.out.print("반납할 도서 번호: ");
            int rental = Integer.parseInt(scanner.nextLine());

            String sql1 = "DELETE FROM RENTAL_TABLE WHERE USER_ID=? AND BOOK_PK=?";

            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setString(1, user);
            pstmt1.setInt(2, rental);
            int rows1 = pstmt1.executeUpdate();

            String sql2 = "" +
                "UPDATE BOOK_TABLE " +
                "SET BOOK_RENTAL = 'Y' WHERE BOOK_PK = ?";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1, rental);
            int rows2 = pstmt2.executeUpdate();
            
            if (rows1 > 0 && rows2 > 0) {
                System.out.println("반납 처리가 완료되었습니다.");
            } else {
                System.out.println("해당 번호를 찾을 수 없습니다.");
            }
            scanner.close();
            pstmt1.close();
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
