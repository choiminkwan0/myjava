package oracle2.project.administrator.search;

public class Book {
    private int BOOK_PK;
    private int ISBN;
    private String BOOK_NAME;
    private String AUTHOR;
    private String PUBLISHER;
    private String BOOK_RENTAL;


    public void setBOOK_PK(int bOOK_PK) {
        BOOK_PK = bOOK_PK;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public void setBOOK_NAME(String bOOK_NAME) {
        BOOK_NAME = bOOK_NAME;
    }
    public void setAUTHOR(String aUTHOR) {
        AUTHOR = aUTHOR;
    }
    
    public void setPUBLISHER(String pUBLISHER) {
        PUBLISHER = pUBLISHER;
    }
    public void setBOOK_RENTAL(String bOOK_RENTAL) {
        BOOK_RENTAL = bOOK_RENTAL;
    }
   
    public int getBOOK_PK() {
        return BOOK_PK;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getBOOK_NAME() {
        return BOOK_NAME;
    }
    public String getAUTHOR() {
        return AUTHOR;
    }
    public String getPUBLISHER() {
        return PUBLISHER;
    }
    public String getBOOK_RENTAL() {
        return BOOK_RENTAL;
    }
   
    @Override
    public String toString() {
        return "도서번호: " + BOOK_PK + ", " + "ISBN: " + ISBN + ", " + 
        "도서명: " + BOOK_NAME + ", " + "저자: " + AUTHOR + ", " + 
        "출판사: " + PUBLISHER + ", " + "대여가능여부: " + BOOK_RENTAL;
    }
}    

