package test;

public class Test {
    public static void main(String[] args) {
        double[] scores = new double[10];        
        scores[0] = 90;
        scores[1] = 82;
        scores[2] = 85;
        scores[3] = 80;
        scores[4] = 92;
        scores[5] = 75;
        scores[6] = 78;
        scores[7] = 100;
        scores[8] = 87;
        scores[9] = 94;

        for(int i=0; i<scores.length; i++)
        System.out.println("점수: " + scores[i]);
        System.out.println();
        
        double sum=0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("합계: " + sum);
        System.out.println();

        double avg = sum / scores.length;
        System.out.println("평균: " + avg);
        System.out.println(); 

        double max = scores[0];
        for(int i=0; i<scores.length; i++) {
            if(scores[i] < max) {
            } else { 
                max = scores[i];  
                System.out.println(); 
                System.out.println("최고점수 변경");  
            }
            System.out.println("점수: " + scores[i]);
        }        
        
    }
}
