package projects.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String answer = "";

        while (!answer.equals("exit")) {

            System.out.println("숫자를 입력해주세요.");
            int num1 = scanner.nextInt();

            System.out.println("연산 기호를 입력해주세요. (+, -, *, /, %)");
            char operator = scanner.next().charAt(0);

            System.out.println("숫자를 입력해주세요.");
            int num2 = scanner.nextInt();

            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("저장된 결과: " + calculator.getResultList());
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, reset 입력 시 저장된 결과 초기화)");
            answer = scanner.next();
            if (answer.equals("reset")) {
                List<Integer> newList = new ArrayList<>();
                calculator.setResultList(newList);
                System.out.println("저장된 결과 초기화 완료");
            }
        }
        System.out.println("계산기를 종료합니다.");
    }


}
