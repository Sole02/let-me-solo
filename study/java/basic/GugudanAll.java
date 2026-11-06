package basic;

import java.util.Scanner;

public class GugudanAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int num = 2; num <= 9; num++) {
            System.out.println("=== " + num + "단 ===");

            for (int i = 1; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
                }
            System.out.println();
            }
        }

    }




    // 출력예시:
//==== 2단 ====
//            2 x 1 = 2
//            2 x 2 = 4
//            2 x 3 = 6
//            2 x 4 = 8
//            2 x 5 = 10
//            2 x 6 = 12
//            2 x 7 = 14
//            2 x 8 = 16
//            2 x 9 = 18
//
//            ==== 3단 ====
//            3 x 1 = 3
//            3 x 2 = 6
//            3 x 3 = 9
//            ...
//            ==== 9단 ====
//            9 x 1 = 9
//            9 x 2 = 18
//            9 x 3 = 27
//            ...
//            9 x 9 = 81
