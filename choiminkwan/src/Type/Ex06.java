package Type;

public class Ex06 { // 2차원 배열

    public static void main(String[] args) {
        // new 연산자로 배열 생성시 값 목록을 가지고 있지 않음    
        // 2차원 배열은 중첩 for문 사용
        int[][] mathScores = new int[2][3];
        for(int i=0; i<mathScores.length; i++) {
            for(int k=0; k<mathScores[i].length; k++) {
                System.out.println("mathScores["+i+"]["+k+"]="
                + mathScores[i][k]);
            } // [a][b] a행 b열
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for(int i=0; i<englishScores.length; i++) {
            for(int k=0; k<englishScores[i].length; k++) {
                System.out.println("englishScores["+i+"]["+k+"]="
                + englishScores[i][k]);
            }
        }
        System.out.println();
        
        int[][] javaScores={{95,80}, {92,96,80}};
        for(int i=0; i<javaScores.length; i++) {
            for(int k=0; k<javaScores[i].length; k++) {
                System.out.println("javaScores["+i+"]["+k+"]="
                + javaScores[i][k]);
            }
        }
    }    
}
