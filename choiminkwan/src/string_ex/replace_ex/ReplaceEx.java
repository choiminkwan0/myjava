package string_ex.replace_ex;

public class ReplaceEx {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향언어 입니다.자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        // replace(old, new)
        // replace 영구 교체가 아닌 객체가 따로 생성됨

        System.out.println(oldStr);
        System.out.println(newStr);
    }
    
}
