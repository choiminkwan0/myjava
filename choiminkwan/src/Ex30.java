public class Ex30 {

    public static void main(String[] args) {
        /*int sum = 0;

        for(int i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("1~100 합: " + sum);*/

        int sum = 0;
        
        int i = 0;
        for(i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("1~" + (i-1) + " 합: " + sum);
    } // 증감으로 인해 i 값이 101이 되므로 -1을 해야함
    
}
