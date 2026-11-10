package exception;

public class AgeConvertPractice {

    static String[] input = {"20", "abd", "-5"};

    public static void main(String[] args) {

        for (String age : input) {
            try {
                toAge(age);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static int toAge(String input) {

        int age;

        try {
            age = Integer.parseInt(input);
            if (age < 0) {
                throw new IllegalArgumentException("나이는 음수일 수 없습니다.");
            }
            System.out.println("나이: " + age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("잘못된 입력입니다.");
        }
        return age;
    }

}
