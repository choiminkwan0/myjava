package string_ex.trim_ex;

public class TrimEx {
    public static void main(String[] args) {
        String tel1 = "     02";
        String tel2 = "123    ";
        String tel3 = "   1234   ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);
        // trim 앞뒤 공백을 제거한 새로운 문자열을 리턴

    }
    
}
