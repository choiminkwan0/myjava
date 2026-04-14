public class Ex35 {

    public static void main(String[] args) throws Exception {
        for(int i=1; i<=10; i++) {
            if(i%2 !=0) {
                continue;
            } // continue를 만나면 반복문의 증감으로 이동
            System.out.println(i);
        }
    }
    
}
