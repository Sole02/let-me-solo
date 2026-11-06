package basic;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 문자열 입력");
        String firstString = scanner.nextLine();

        System.out.println("두 번째 문자열 입력");
        String secondString = scanner.nextLine();

        boolean result = firstString.equals(secondString);

        System.out.println("두 문자열이 같은가요? \n" + result);


//        // 예상 출력:
//        첫 번째 문자열을 입력하세요: Java
//        두 번째 문자열을 입력하세요: Java
//        두 문자열이 같은가요? true
    }
}
