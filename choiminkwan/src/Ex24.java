public class Ex24 {

    public static void main(String[] args) {
        int score = 85; // 삼항 연산자 
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    } // 조건식 ? 값 또는 연산식(true) : 값 또는 연산식(true 이외)
    
}
