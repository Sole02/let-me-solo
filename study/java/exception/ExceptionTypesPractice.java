package exception;

public class ExceptionTypesPractice {

    public static void main(String[] args) {

        try {
            numbers();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void numbers() {

        int number = Integer.parseInt("abc");

        System.out.println(number);
    }

}
