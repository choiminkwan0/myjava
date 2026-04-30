package oracle2.project.administrator.bookcrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookDelete {
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
            System.out.println("--- 도서삭제 ---");
            System.out.print("도서번호: ");
            int pk = Integer.parseInt(scanner.nextLine());

            String sql = "DELETE FROM BOOK_TABLE WHERE BOOK_PK=? AND BOOK_RENTAL='Y' ";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, pk);

            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 도서: " + rows);
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
