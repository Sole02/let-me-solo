package exception;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adminId = "admin";
        String adminps = "1234";

        while (true) {
            String id = scanner.nextLine();
            String ps = scanner.nextLine();
            try {
                if (!adminId.equals(id) || !adminps.equals(ps)) {
                    throw new RuntimeException("아이디 또는 비밀번호 불일치");
                }
                System.out.println("로그인 성공!");
                break;
        } catch (RuntimeException e) {
                System.out.println("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
            }
        }
    }
}
