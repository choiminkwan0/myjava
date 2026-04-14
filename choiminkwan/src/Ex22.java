public class Ex22 {

    public static void main(String[] args) {
        int charCode = 'A';

        if((charCode >= 65) && (charCode <= 90)) {
            System.out.println("대문자 이군요");
        }
        
        if((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자 이군요");
        }

        if(!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자 이군요");
        } // && 둘다 true일때 true

        int value = 6;

        if((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수 이군요");
        } // || 둘중 하나만 true여도 true

        System.out.println("--------------------------------");
        System.out.println("45 & 25 = " + (45 & 25)); // 논리곱
        System.out.println("45 | 25 = " + (45 | 25)); // 논리합
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        // 두개 중 하나는 true 하나는 false일 경우에만 true
        System.out.println("~45 = " + (~45)); // 반전
        System.out.println("--------------------------------");
    } // 비트 논리 연산자
    
}
