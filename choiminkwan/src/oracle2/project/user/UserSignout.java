package oracle2.project.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSignout {
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

            System.out.println("--- 회원탈퇴 ---");
            System.out.print("아이디: ");
            String id = scanner.nextLine();

            String sql = "DELETE FROM MEMBER_TABLE WHERE USER_ID=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("회원탈퇴에 성공하였습니다.");
            } else {
                System.out.println("회원탈퇴에 실패하였습니다.");
            }
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
