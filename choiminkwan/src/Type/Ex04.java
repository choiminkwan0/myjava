package Type;

public class Ex04 { // 배열 타입 별 항목의 기본값

    public static void main(String[] args) {
        int[] arr1 = new int[3]; // int[] 기본값 0
        // new 연산자로 배열 생성시 값 목록을 가지고 있지 않음
        for(int i=0; i<3; i++) {
            System.out.println("arr1[" + i + "]:" + arr1[i]);
        }
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for(int i=0; i<3; i++) {
            System.out.println("arr1[" + i + "]:" + arr1[i]);
        }

        double[] arr2 = new double[3]; // double[] 기본값 0.0
        for(int i=0; i<3; i++) {
            System.out.println("arr2[" + i + "]:" + arr2[i]);
        }
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for(int i=0; i<3; i++) {
            System.out.println("arr2[" + i + "]:" + arr2[i]);
        }

        String[] arr3 = new String[3]; // 클래스[] 기본값 null
        for(int i=0; i<3; i++) {
            System.out.println("arr3[" + i + "]:" + arr3[i]);
        }
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for(int i=0; i<3; i++) {
            System.out.println("arr3[" + i + "]:" + arr3[i]);
        }
    }
}
