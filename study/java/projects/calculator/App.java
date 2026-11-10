package projects.calculator;

import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String answer = "";

        while (!answer.equals("exit")) {

            System.out.println("숫자를 입력해주세요.");
            int num1 = scanner.nextInt();

            System.out.println("연산 기호를 입력해주세요. (+, -, *, /, %)");
            char symbol = scanner.next().charAt(0);

            System.out.println("숫자를 입력해주세요.");
            int num2 = scanner.nextInt();

            int result = 0;

            if (symbol == '+') {
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);

            } else if (symbol == '-') {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);

            } else if (symbol == '*') {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);

            } else if (symbol == '%') {
                if (num2 == 0) {
                    System.out.println("두번째 정수에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                }

            } else if (symbol == '/') {
                if (num2 == 0) {
                    System.out.println("두번째 정수에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }

            } else {
                System.out.println("지원하지 않는 기호입니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = scanner.next();
        }
        System.out.println("계산기를 종료합니다.");
    }


}
