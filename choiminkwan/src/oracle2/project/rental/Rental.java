package oracle2.project.rental;

public class Rental {
    private int RENTAL_PK;
    private String USER_ID;
    private int BOOK_PK;
    private String RENTAL_DATE;
    private String RETURN_SCHEDULE;
    private String RETURN_DATE;
    private String OVERDUE;

    public void setRENTAL_PK(int rENTAL_PK) {
        RENTAL_PK = rENTAL_PK;
    }
    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }
    public void setBOOK_PK(int bOOK_PK) {
        BOOK_PK = bOOK_PK;
    }
    public void setRENTAL_DATE(String rENTAL_DATE) {
        RENTAL_DATE = rENTAL_DATE;
    }
    public void setRETURN_SCHEDULE(String rETURN_SCHEDULE) {
        RETURN_SCHEDULE = rETURN_SCHEDULE;
    }
    public void setRETURN_DATE(String rETURN_DATE) {
        RETURN_DATE = rETURN_DATE;
    }
    public void setOVERDUE(String oVERDUE) {
        OVERDUE = oVERDUE;
    }

    public int getRENTAL_PK() {
        return RENTAL_PK;
    }
    public String getUSER_ID() {
        return USER_ID;
    }
    public int getBOOK_PK() {
        return BOOK_PK;
    }
    public String getRENTAL_DATE() {
        return RENTAL_DATE;
    }
    public String getRETURN_SCHEDULE() {
        return RETURN_SCHEDULE;
    }
    public String getRETURN_DATE() {
        return RETURN_DATE;
    }
    public String getOVERDUE() {
        return OVERDUE;
    }

    @Override
    public String toString() {
        return "대여번호: " + RENTAL_PK + ", " + "회원ID: " + USER_ID + ", " 
        + "도서번호: " + BOOK_PK + ", " + "대여일: " + RENTAL_DATE + ", " + 
        "반납예정일: " + RETURN_SCHEDULE + ", " + "실제반납일: " + RETURN_DATE
        + ", " + "연체여부: " + OVERDUE;
    }
}
