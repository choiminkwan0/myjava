public class Ex12 {

    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        // parse (정적메소드) 문자열을 기본형(값 자체)으로 변환
        // Integer 10진수형 정수 객체

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        // valueOF 문자열을 객채형(주소 + 기능)으로 변환
        // String 문자열을 저장하는 객체, 키보드로 입력받은 모든 값

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
    
}

