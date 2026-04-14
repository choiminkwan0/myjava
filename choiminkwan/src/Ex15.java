public class Ex15 {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("------------------------");
        x++; // 후위 증감(연산 후 증감)
        ++x; // 전위 증감(증감 후 연산)
        System.out.println("x=" + x);

        System.out.println("------------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        
        System.out.println("------------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("------------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
    
}
