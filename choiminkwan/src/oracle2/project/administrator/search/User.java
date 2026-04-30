package oracle2.project.administrator.search;

public class User {
    private String USER_ID;
    private String USER_PW;
    private String USER_NAME;
    private String USER_TEL;
    private String USER_DATE;
    private String USER_RENTAL;

    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }
    public void setUSER_PW(String uSER_PW) {
        USER_PW = uSER_PW;
    }
    public void setUSER_NAME(String uSER_NAME) {
        USER_NAME = uSER_NAME;
    }
    public void setUSER_TEL(String uSER_TEL) {
        USER_TEL = uSER_TEL;
    }
    public void setUSER_DATE(String uSER_DATE) {
        USER_DATE = uSER_DATE;
    }
    public void setUSER_RENTAL(String uSER_RENTAL) {
        USER_RENTAL = uSER_RENTAL;
    }

    public String getUSER_ID() {
        return USER_ID;
    }
    public String getUSER_PW() {
        return USER_PW;
    }
    public String getUSER_NAME() {
        return USER_NAME;
    }
    public String getUSER_TEL() {
        return USER_TEL;
    }
    public String getUSER_DATE() {
        return USER_DATE;
    }
    public String getUSER_RENTAL() {
        return USER_RENTAL;
    }

    @Override
    public String toString() {
        return "회원ID: " + USER_ID + ", " + "비밀번호: " + USER_PW + ", " 
        + "이름: " + USER_NAME + ", " + "전화번호: " + USER_TEL + ", " + 
        "가입일: " + USER_DATE + ", " + "대여정지여부: " + USER_RENTAL;
    }
}
