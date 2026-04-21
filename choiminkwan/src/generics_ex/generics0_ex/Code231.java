package generics_ex.generics0_ex;

class Data<T extends Number> { // Number 클래스의 하위 클래스 타입
    T obj;
    Data(T ob) {
        obj = ob;
    }
    int calcMultiple(int n) {
        return obj.intValue() * n;
    }
}

public class Code231 {
    public static void main(String[] args) {
        Data<Integer> d = new Data<Integer>(100);
        // Integer는 Number의 하위 클래스
        int result = d.calcMultiple(5);
        System.out.println(result);

        Data<Double> e = new Data<Double>(17.5);
        // Double 역시 Number의 하위 클래스
        int result2 = e.calcMultiple(5);
        System.out.println(result2);
    }
    
}
