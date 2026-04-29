package oracle2.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BookSearch {
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

            System.out.println("--- 도서 검색 ---");
            System.out.print("이름: ");
            String name = scanner.nextLine();

            String sql = "" +
                "SELECT BOOK_PK, ISBN, BOOK_NAME, AUTHOR, PUBLISHER, BOOK_RENTAL " +
                "FROM BOOK_TABLE " +
                "WHERE BOOK_NAME=?";      
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, name);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                Book book = new Book();
                book.setBOOK_PK(rs.getInt("BOOK_PK"));
                book.setISBN(rs.getInt("ISBN"));
                book.setBOOK_NAME(rs.getString("BOOK_NAME"));
                book.setAUTHOR(rs.getString("AUTHOR"));
                book.setPUBLISHER(rs.getString("PUBLISHER"));
                book.setBOOK_RENTAL(rs.getString("BOOK_RENTAL"));
                System.out.println(book);
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
