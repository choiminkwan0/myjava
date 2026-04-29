package oracle2.project.bookcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            pstmt.setInt(1, 1002);
            pstmt.setString(2, "심청");
            pstmt.setString(3, "심청");
            pstmt.setString(4, "효녀");
            pstmt.setString(5, "가능");
            pstmt.setInt(6, 8);

            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수: " + rows);

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
