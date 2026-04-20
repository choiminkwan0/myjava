package object_ex.smartphone;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        // toString() 객체를 문자열로 표현한 값
        System.out.println(strObj);

        System.out.println(myPhone);
    }
    
}
