package Type;

public class Ex02 { // 값 목록으로 배열 생성

    public static void main(String[] args) {
        int[] scores = {83, 90, 87}; // 리터럴 배열 객체 선언 
        /*  1.타입[] 변수; << 평균적으로 많이 사용
            2.타입 변수[]; */

        System.out.println("scores[0]: " + scores[0]);
        // 변수[n] n인덱스안의 공간
        System.out.println("scores[1]: " + scores[1]);
        System.out.println("scores[2]: " + scores[2]);

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        // 일시적 형변환이므로 sum의 값은 int형 유지
        System.out.println("평균: " + avg);
    }
    
}
