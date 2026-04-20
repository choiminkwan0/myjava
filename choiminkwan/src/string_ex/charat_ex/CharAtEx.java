package string_ex.charat_ex;

public class CharAtEx {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        char sex = ssn.charAt(7);
        // charAt(int index) 특정 위치의 문자 리턴
        // 메소드명(매개변수)
        switch(sex) {
            case '1': 
            case '3':
            System.out.println("남자 입니다.");
            break;

            case '2': 
            case '4':
            System.out.println("여자 입니다.");
            break;
        }
    }
    
}
