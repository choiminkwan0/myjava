package string_ex.substring_ex;

public class SubstringEx {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        // substring = end 비포함

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);
    /*  beginIndex 위치에서 endIndex(비포함)까지 
    짤라낸 새로운 문자열을 리턴 */
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    // beginIndex 위치에서 끝까지 짤라낸 새로운 문자열을 리턴
    }
    
}
