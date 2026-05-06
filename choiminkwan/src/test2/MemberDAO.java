package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "1234");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1.회원 가입");
                System.out.println("2.회원 탈퇴");
                System.out.println("3.저장 및 종료");
                System.out.print("메뉴 선택 >> ");
                String str = scanner.nextLine();
                int x = Integer.parseInt(str);

                if (x == 1) {
                    System.out.println("--- 회원가입 ---");
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("아이디: ");
                    String id = scanner.nextLine();
                    System.out.print("비밀번호: ");
                    String pw = scanner.nextLine();
                    System.out.println("================================");

                    String sql = "" +
                            "INSERT INTO TBL_MEMBER (USER_NAME, USER_ID, USER_PW)" +
                            "VALUES (?, ?, ?)";

                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, name);
                    pstmt.setString(2, id);
                    pstmt.setString(3, pw);

                    int rows = pstmt.executeUpdate();
                    if (rows > 0) {
                        System.out.println("회원가입에 성공하였습니다.");
                    } else {
                        System.out.println("회원가입에 실패하였습니다.");
                    }
                    System.out.println("================================");
                    pstmt.close();
                }

                if (x == 2) {
                    System.out.println("--- 회원탈퇴 ---");
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("아이디: ");
                    String id = scanner.nextLine();
                    System.out.print("비밀번호: ");
                    String pw = scanner.nextLine();
                    System.out.println("================================");

                    String sql = "DELETE FROM TBL_MEMBER WHERE USER_ID=?";

                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, id);

                    int rows = pstmt.executeUpdate();
                    if (rows > 0) {
                        System.out.println("회원탈퇴에 성공하였습니다.");
                    } else {
                        System.out.println("회원탈퇴에 실패하였습니다.");
                    }
                    System.out.println("================================");
                    pstmt.close();
                }

                if (x == 3) {
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("================================");
                    break;
                }
            }
            scanner.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("이미 사용 중인 아이디입니다.");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
