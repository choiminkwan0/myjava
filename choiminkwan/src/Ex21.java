public class Ex21 {

    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        String strVar3 = new String("신민철");

        System.out.println(strVar1 == strVar2);
        // 주소가 같으므로 true
        System.out.println(strVar1 == strVar3);
        // 주소가 다르므로 false
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
        // 주소안의 값이 같으므로 true
    }
    
}
