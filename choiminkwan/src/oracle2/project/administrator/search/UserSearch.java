package oracle2.project.administrator.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSearch {
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

            System.out.println("--- 회원 검색 ---");
            System.out.print("이름: ");
            String name = scanner.nextLine();

            String sql = "" +
                "SELECT USER_ID, USER_PW, USER_NAME, USER_TEL, USER_DATE, USER_RENTAL " +
                "FROM MEMBER_TABLE " +
                "WHERE USER_NAME=?";           
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, name);
           
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                User user = new User();
                user.setUSER_ID(rs.getString("USER_ID"));
                user.setUSER_PW(rs.getString("USER_PW"));
                user.setUSER_NAME(rs.getString("USER_NAME"));
                user.setUSER_TEL(rs.getString("USER_TEL"));
                user.setUSER_DATE(rs.getString("USER_DATE"));
                user.setUSER_RENTAL(rs.getString("USER_RENTAL"));
                System.out.println(user);
            } else {
                System.out.println("존재하지 않는 회원");
            }
            scanner.close();
            rs.close();
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
