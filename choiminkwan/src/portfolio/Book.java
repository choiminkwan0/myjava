package portfolio;

public class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    String toFileString() {
        return id + " " + title + " " + author;
    }
    
}
