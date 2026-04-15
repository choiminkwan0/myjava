package class_ex;

public class Car_03 { // 생성자의 오버로딩
    // 필드
    String company = "현대자동차";
    String model; // 기본 값 null
    String color;
    int maxSpeed; // 기본 값 0

    // 생성자
    Car_03() {}

    Car_03(String model) {
        this.model = model;
    }

    Car_03(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car_03(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    /* this() 메소드 
    생성자 안에서 첫번쨰 행에서만 사용가능
    나 아닌 다른 생성자 호출(떠넘기기)
    중복 코드를 줄여줌 */
    
    /*  Car_03() {}

    Car_03(String model) {
        this(model, null, 0);
    }

    Car_03(String model, String color) {
        this(model, color, 0);
    }

    Car_03(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }*/
    
}
