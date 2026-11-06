package basic;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 구구단 단수를 입력하세요");
        int num = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }



    // 출력예시:
//    출력할 구구단 단수를 입력하세요 (2~9): 3
//            ==== 3단 ====
//            3 x 1 = 3
//            3 x 2 = 6
//            3 x 3 = 9
//            3 x 4 = 12
//            3 x 5 = 15
//            3 x 6 = 18
//            3 x 7 = 21
//            3 x 8 = 24
//            3 x 9 = 27
}
