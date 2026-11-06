package basic;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8};
        int num = 0;

        for (int a : arr) {
            num += a;
        }
        System.out.println("누적합: " + num);
    }


    // 예상 출력:
//    누적합: 15
}
