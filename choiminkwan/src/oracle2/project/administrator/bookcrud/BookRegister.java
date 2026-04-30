package oracle2.project.administrator.bookcrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

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
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- 도서등록 ---");
            System.out.print("도서번호: ");
            int pk = Integer.parseInt(scanner.nextLine());
            System.out.print("고유번호: ");
            int isbn = Integer.parseInt(scanner.nextLine());
            System.out.print("도서명: ");
            String name = scanner.nextLine();
            System.out.print("저자: ");
            String author = scanner.nextLine();
            System.out.print("출판사: ");
            String publisher = scanner.nextLine();
            System.out.print("대여가능여부: ");
            String rental = scanner.nextLine();

            String sql = "" +
                "INSERT INTO BOOK_TABLE (BOOK_PK, ISBN, BOOK_NAME, AUTHOR, PUBLISHER, BOOK_RENTAL)" +
                "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, pk);
            pstmt.setInt(2, isbn);
            pstmt.setString(3, name);
            pstmt.setString(4, author);
            pstmt.setString(5, publisher);
            pstmt.setString(6, rental);
        
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 도서: " + rows);
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
