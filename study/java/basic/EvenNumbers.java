package basic;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] num = {3, 4, 7, 10, 15, 20};

        for (int a : num) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}



    // 예상 출력:
//    짝수: 4 10 20
