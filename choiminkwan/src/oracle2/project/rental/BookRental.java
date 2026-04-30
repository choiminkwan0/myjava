package oracle2.project.rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookRental {
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

            System.out.println("--- 도서 대여 등록 ---");
                       
            System.out.print("회원 아이디: ");
            String user = scanner.nextLine();
            System.out.print("도서 번호: ");
            int book = Integer.parseInt(scanner.nextLine());

            String sql1 = "" +
                "INSERT INTO RENTAL_TABLE (RENTAL_PK, USER_ID, BOOK_PK, RENTAL_DATE, RETURN_SCHEDULE, RETURN_DATE, OVERDUE)" +
                "VALUES (SEQ_BNO.NEXTVAL, ?, ?, SYSDATE, SYSDATE + 7, NULL, 'N')";
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setString(1, user);
            pstmt1.setInt(2, book);
            int rows1 = pstmt1.executeUpdate();

            String sql2 = "" +
                "UPDATE BOOK_TABLE " +
                "SET BOOK_RENTAL = 'N' WHERE BOOK_PK = ?";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1, book);
            int rows2 = pstmt2.executeUpdate();
            
            if (rows1 > 0 && rows2 > 0) {
                System.out.println("대여가 성공적으로 완료되었습니다.");
            } else {
                System.out.println("대여할 수 없는 도서입니다.");
            }   
            scanner.close();
            pstmt2.close();
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
