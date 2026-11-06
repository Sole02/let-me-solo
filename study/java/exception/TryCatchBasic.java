package exception;

public class TryCatchBasic {

    public static void main(String[] args) {
        System.out.println("1. 시작");

        try {
            check(10);
            System.out.println("2. 통과");
        } catch (RuntimeException e) {
            System.out.println("3. 잡았다: " + e.getMessage());
        }

        System.out.println("4. 끝");
    }

    public static void check(int age) {
        if (age < 18) {
            throw new RuntimeException("미성년자입니다!");
        }
    }
}