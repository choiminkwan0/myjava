package class_ex2.exam01.package1;

public class B { // 접근 제한자
    public B () {
        A a = new A();
        a.field1 = 1; // public
        a.field2 = 1; // default
        // a.field3 = 1; // private

        a.method1(); // public
        a.method2(); // default
        // a.method3(); // private
    }
    
}
