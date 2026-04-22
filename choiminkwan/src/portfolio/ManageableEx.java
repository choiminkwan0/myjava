package portfolio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManageableEx implements Manageable {
    Book[] books = new Book[10];
    int count = 0;
    FileOutputStream fos = null;
    FileInputStream fis = null;
    InputStreamReader reader = null;

    public void addItem(Book book) {
        if (count<books.length){
            books[count++] = book;    
        } else {
            System.out.println("더 이상 등록할 수 없습니다.");
            System.out.println("================================");
        }  
    }

    public void displayAll() {
        if(count==0) {
            System.out.println("등록된 도서가 없습니다.");
            System.out.println("================================");
            return;
        } else {
        for(int i=0; i<books.length; i++) {
            System.out.println("번호: " + books[i].id);
            System.out.println("제목: " + books[i].title);
            System.out.println("저자: " + books[i].author);
            System.out.println("================================");
        }
    }
}

    public void saveToFile() {
        try {
            fos = new FileOutputStream("C:/myjava/choiminkwan/src/portfolio/books.txt");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {            
            try {
                fos.close();
            } catch(IOException e) {
                System.out.println(e);
            }
        }

    }

    public void loadFromFile() {
        try {
            fis = new FileInputStream("C:/myjava/choiminkwan/src/portfolio/books.txt");
            reader = new InputStreamReader(fis);
            int y;
            while((y = reader.read()) != -1)
            System.out.print((char) y);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }
    
}
