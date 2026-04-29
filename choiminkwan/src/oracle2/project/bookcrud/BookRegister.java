package oracle2.project.bookcrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRegister {
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

            String sql = "" +
                "INSERT INTO BOOK_TABLE (BOOK_PK, ISBN, BOOK_NAME, AUTHOR, PUBLISHER, BOOK_RENTAL)" +
                "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 9);
            pstmt.setInt(2, 1042);
            pstmt.setString(3, "흥부놀부");
            pstmt.setString(4, "흥부");
            pstmt.setString(5, "형제");
            pstmt.setString(6, "가능");

            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행수: " + rows);
            
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
