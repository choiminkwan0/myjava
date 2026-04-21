package generics_ex.generics0_ex;

class WithWild<T extends Number> { // 와일드카드
    T data;
    WithWild(T d) {data = d;}

    // '?'로 나타냄 - 와일트카드 자리에는 어떤 클래스 타입도 올 수 있음
    boolean same(WithWild<?> x) {
        if(Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue()))
        return true;
        return false;
    }
}

public class Code232 {
    public static void main(String[] args) {
        WithWild<Integer> a = new WithWild<Integer>(6);
        WithWild<Double> b = new WithWild<Double>(-6.0);
        WithWild<Long> c = new WithWild<Long>(5L);
        if(a.same(b)) System.out.println("a, b are equal");
        else System.out.println("a, b are different");
        if(a.same(c)) System.out.println("a, c are equal");
        else System.out.println("a, c are different");
    }
    
}
