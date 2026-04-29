package oracle2.project.bookcrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

            String sql = "DELETE FROM BOOK_TABLE WHERE BOOK_PK=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 5);

            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수: " + rows);

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
