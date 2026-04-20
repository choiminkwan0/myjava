package object_ex.clone_ex.clone0;

public class Clone0_ex {
    public static void main(String[] args) {
        // 원본 객체 생성
        Clone0 original = new Clone0("blue", "홍길동",
         "12345", 25, true);

        // 복제 객체를 얻은 후에 패스워드 변경
        Clone0 cloned = original.getMember();
        cloned.pw = "67890";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: " + cloned.id);
        System.out.println("name: " + cloned.name);
        System.out.println("pw: " + cloned.pw);
        System.out.println("age: " + cloned.age);
        System.out.println("adult: " + cloned.adult);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: " + original.id);
        System.out.println("name: " + original.name);
        System.out.println("pw: " + original.pw);
        System.out.println("age: " + original.age);
        System.out.println("adult: " + original.adult);
    }
    
}
