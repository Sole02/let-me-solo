package exception;

public class ExceptionPropagation {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            first();
            System.out.println("2");
        } catch (RuntimeException e) {
            System.out.println("3: " + e.getMessage());
        }
        System.out.println("4");
    }

    public static void first() {
        System.out.println("first 시작");
        second();
        System.out.println("first 끝");
    }

    public static void second() {
        System.out.println("second 시작");
        throw new RuntimeException("second에서 문제!");
    }
}