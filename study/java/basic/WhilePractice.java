package basic;

import java.util.Scanner;

public class WhilePractice {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            i++;
            System.out.println(i);
        }


        int count = 10;

        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("발사!");


        int sum = 0;
        int num = 0;

        while (sum <= 100 ) {
            num += 1;
            sum += num;
            System.out.println("현재 합: " + sum);
        }
        System.out.println("마지막으로 더한 수: " + num);


        int number = 12345;
        int digitSum = 0;

        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }
        System.out.println(digitSum);


        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력하세요.");
        String ps = scanner.nextLine();

        while (!ps.equals("1234")) {
            System.out.println("틀렸습니다. 다시 입력하세요.");
            ps = scanner.nextLine();
        }
        System.out.println("로그인 성공!");


        int number2 = 98765;
        int count2 = 0;

        while (number2 > 0) {
            number2 /= 10;
            count2++;
        }
        System.out.println("number2의 자릿 수: " + count2);


        int number3 = 12345;
        int reversed = 0;

        while (number3 > 0) {
            reversed *= 10;
            reversed += number3 % 10;
            number3 /= 10;
        }
        System.out.println(reversed);

    }
}
