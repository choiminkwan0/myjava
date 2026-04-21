package string_ex.wrapper_ex;

public class WrapperEx {
    public static void main(String[] args) {
        // 문자열을 기본 타입 값으로 변환
        // parse + 기본타입 명 -> 정적 메소드
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        byte value4 = Byte.parseByte("10");
        float value5 = Float.parseFloat("2.5F");
        long value6 = Long.parseLong("10000000");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);
        System.out.println("value4: " + value4);
        System.out.println("value5: " + value5);
        System.out.println("value6: " + value6);
    }
    
}
/* 포장값 비교
    - 포장 객체는 내부 값을 비교하기 위해 == != 연산자 사용 불가
    - 값을 언박싱해 비교하거나 equals() 메소드로 내부 값 비교할 것
 */
