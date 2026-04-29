package oracle2.project;

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
        return BOOK_PK + " " + ISBN + " " + BOOK_NAME + " " +
        AUTHOR + " " + PUBLISHER + " " + BOOK_RENTAL;
    }
}    

