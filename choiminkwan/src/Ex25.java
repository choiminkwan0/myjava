public class Ex25 {

    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81;
        // Math.random() 0 <= n < 1 사이의 수를 double로 반환
        // ex) Math.random()*20 (0~19까지의 수가 나옴)
        System.out.println("점수: " + score);

        String grade;

        if(score >= 90) {
            if(score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if(score >=85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }

        System.out.println("학점: " + grade);
    }
    
}
