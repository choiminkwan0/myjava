package oracle2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BoardSelectEx {
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
            String sql = "" +
            "SELECT btitle, bcontent, bwriter, bdate, bfilename " +
            "FROM boards " +
            "WHERE btitle=?";

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈오는 날");

            // SQL문 실행 후 ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                Board board = new Board();
                board.setbTitle(rs.getString("btitle"));
                board.setbContent(rs.getString("bcontent"));
                board.setbWriter(rs.getString("bwriter"));
                board.setbDate(rs.getString("bdate"));
                board.setbFileName(rs.getString("bfilename"));
                System.out.println(board);
            } else {
                System.out.println("사용자 아이디가 존재하지 않음");
            }
            rs.close();

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
