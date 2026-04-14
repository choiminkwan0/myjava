public class Ex27 {

    public static void main(String[] args) {
        String position = "과장";

        switch(position) { // switch 선택문
            case "부장":
            System.out.println("700만원");
            break;

            case "과장":
            System.out.println("500만원");
            break;

            default:
            System.out.println("300만원");
        }
    }
    
}
