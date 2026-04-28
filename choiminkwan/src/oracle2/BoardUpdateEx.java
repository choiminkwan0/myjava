package oracle2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateEx {
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
            .append("UPDATE boards SET ")
            .append("btitle=?, ")
            .append("bcontent=?, ")
            .append("bfilename=? ")
            .append("WHERE bno=?")
            .toString();

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "snowman.jpg");
            pstmt.setInt(4, 7);

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
