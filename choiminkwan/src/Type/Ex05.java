package Type;

public class Ex05 { // 배열의 length

    public static void main(String[] args) {
        int[] scores = {83,90,87};

        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        } // length 배열의 길이
        System.out.println("총합: " + sum);

        float avg = (float) sum / scores.length;
        // 일시적 형변환 이므로 sum의 값은 int형 유지
        System.out.println("평균: " + avg);
    }
    
}
