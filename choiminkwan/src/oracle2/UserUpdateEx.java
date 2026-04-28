package oracle2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class UserUpdateEx {
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

            // 매개변수화된 SQL문 작성
            String sql = new StringBuilder()
                .append("UPDATE users SET ")
                .append("username=?,")
                .append("userpassword=?, ")
                .append("userage=?, ")
                .append("useremail=? ")
                .append("WHERE userid=?")
                .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "한여름");
            pstmt.setString(2, "23456");
            pstmt.setInt(3, 30);
            pstmt.setString(4, "summer@mycompany.com");
            pstmt.setString(5, "winter2");
            
            // SQL문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수: " + rows);

            // PreparedStatement 닫기
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
