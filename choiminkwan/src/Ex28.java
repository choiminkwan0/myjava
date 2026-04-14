public class Ex28 {

    public static void main(String[] args) {
        String fruit = "사과";

        switch(fruit) {
            case "사과": 
            System.out.println("1000원");
            break;

            case "바나나":
            System.out.println("2000원");
            break;

            case "포도": 
            System.out.println("5000원");
            break;

            default: 
            System.out.println("판매하지 않는 과일입니다.");
        }
    }
    
}
