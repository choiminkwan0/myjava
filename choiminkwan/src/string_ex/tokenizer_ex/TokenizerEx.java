package string_ex.tokenizer_ex;

import java.util.StringTokenizer;

public class TokenizerEx {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(text, "/");

        // 남아 있는 토큰을 확인하고 while문으로 루핑
        st = new StringTokenizer(text, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
    
}
