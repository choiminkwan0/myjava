package oracle2.project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class UserLogin {
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

            System.out.println("--- 로그인 ---");
            System.out.print("아이디: ");
            String id = scanner.nextLine();
            System.out.print("비밀번호: ");
            String pw = scanner.nextLine();

            String sql = "{? = call USER_LOGIN(?, ?)}";
            CallableStatement cstmt = conn.prepareCall(sql);

            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, id);
            cstmt.setString(3, pw);

            cstmt.execute();
            int result = cstmt.getInt(1);
          
            cstmt.close();
            String message = switch (result) {
                case 0 -> "로그인 성공";
                case 1 -> "비밀번호가 틀림";
                default -> "아이디가 존재하지 않음";
            };
            System.out.println(message);

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
