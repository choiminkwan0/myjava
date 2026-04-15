package class_ex;

public class GasEx {

    public static void main(String[] args) {
        Gas myGas = new Gas();

        myGas.setGas(5); // Gas의 setGas() 메소드 호출

        boolean gasState = myGas.isLeftGas(); // Gas의 isLeftGas() 메소드 호출
        if(gasState) {
            System.out.println("출발합니다.");
            myGas.run(); // Gas의 run() 메소드 호출
        }

        if(myGas.isLeftGas()) { // Gas의 isLeftGas() 메소드 호출
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
    
}
