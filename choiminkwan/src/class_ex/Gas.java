package class_ex;

public class Gas {
    // 필드
    int gas;

    // 생성자

    // 메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() { // is.. = true, false 반환값 받을때 사용
        if(gas==0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 없습니다.");
        return true;        
    }
    
    void run() {
        while(true) {
            if(gas>0) {
                System.out.println("달립니다.(gas잔량: " + gas + ")");
                gas --; // gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량: " + gas + ")");
                return;
            }
        }
    }
    
}
