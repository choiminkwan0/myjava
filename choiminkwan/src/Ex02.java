public class Ex02 {   
        public static void main(String[] args) {
            int v1 = 15;
            if(v1>10) { 
                int v2;  
                v2 = v1 - 10; 
            } // {}안에 있으면 사용못함
            int v2 = v1 - 10;
            int v3 = v1 + v2 + 5;
            System.out.println(v3);
        } // A,65/ a,97/ 0,48/ 스페이스바,32 
    }

