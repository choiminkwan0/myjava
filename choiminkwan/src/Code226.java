import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Code226 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        // Buffered 입출력을 실행할 때 버피링 기능을 이용하여 좀 더 빠르게 입출력이 이루어짐.
        // Stream으로 끝나기 떄문에 바이트 단위로 입출력
        try {
            bis = new BufferedInputStream(new FileInputStream("C:/myjava/choiminkwan/src/data6.txt"));
            int x = 0;
            while ((x = bis.read()) !=-1)
            System.out.print((char) x);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }
    
}
