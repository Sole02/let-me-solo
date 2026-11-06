package exception;

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("아이디를 입력 해 주세요.");
                String id = scanner.nextLine();

                System.out.println("비밀번호를 입력 해 주세요.");
                String ps = scanner.nextLine();

                login(id, ps);
                System.out.println("로그인 성공!");
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void login(String id, String ps) throws Exception {
        if (!id.equals("admin") || !ps.equals("1234")) {
            throw new RuntimeException("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }
}
