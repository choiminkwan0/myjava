package string_ex.valueof_ex;

public class ValueOfEx {
    public static void main(String[] args) {
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    } // valueOf 기본 타입값을 문자열로 리턴
    
}
