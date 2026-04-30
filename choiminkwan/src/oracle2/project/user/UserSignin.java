package oracle2.project.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSignin {
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

            System.out.println("--- 회원가입 ---");
            System.out.print("아이디: ");
            String id = scanner.nextLine();
            System.out.print("비밀번호: ");
            String pw = scanner.nextLine();
            System.out.print("이름: ");
            String name = scanner.nextLine();
            System.out.print("전화번호: ");
            String tel = scanner.nextLine();

            String sql = "" +
                "INSERT INTO MEMBER_TABLE (USER_ID, USER_PW, USER_NAME, USER_TEL)" + 
                "VALUES (?, ?, ?, ?)";
        
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            pstmt.setString(3, name);
            pstmt.setString(4, tel);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("회원가입에 성공하였습니다.");
            } else {
                System.out.println("회원가입에 실패하였습니다.");
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
