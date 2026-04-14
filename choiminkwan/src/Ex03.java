public class Ex03 {
    
    public static void main(String[] args) {
        byte var1 = -128; // 1byte = 8bit
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        // byte var6 = 128; // 컴파일 에러 
        // 양수는 0 ~ 127 음수는 -1 ~ -128
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        int var6 = 18; // 10진수 // int = 4byte = 32bit
        int var7 = 022; // 8진수
        int var8 = 0x12; // 16진수

        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

        long var9 = 10; // long = 8byte = 64bit
        long var10 = 20L;
        // long var11 = 10000000000; // 컴파일 에러
        // long 타입에서 큰 값은 뒤에 L을 꼭 붙혀야함
        long var12 = 10000000000L;

        System.out.println(var9);
        System.out.println(var10);
        System.out.println(var12);
    }
    
}
