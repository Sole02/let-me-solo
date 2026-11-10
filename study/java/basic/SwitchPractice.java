package basic;

public class SwitchPractice {

    public static void main(String[] args) {

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("월요일");
                break;

            case 2:
                System.out.println("화요일");
                break;

            case 3:
                System.out.println("수요일");
                break;

            case 4:
                System.out.println("목요일");
                break;

            case 5:
                System.out.println("금요일");
                break;

            case 6:
                System.out.println("토요일");
                break;

            default:
                System.out.println("일요일");
        }

        int month = 3;

        switch (month) {
            case 3, 4, 5:
                System.out.println("봄");
                break;

            case 6, 7, 8:
                System.out.println("여름");
                break;

            case 9, 10, 11:
                System.out.println("가을");
                break;

            case 12, 1, 2:
                System.out.println("겨울");
                break;

            default:
                System.out.println("기타");
        }

        char grade = 'B';

        switch (grade) {
            case 'A' -> System.out.println("우수");
            case 'B' -> System.out.println("보통");
            case 'C' -> System.out.println("노력 필요");
            default -> System.out.println("잘못된 등급");
        }

        int a = 10;
        int b = 3;
        char op = '*';
        int result = 0;

        switch (op) {
            case '+' -> {
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            }
            case '-' -> {
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }
            case '*' -> {
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            }
            case '/' -> {
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            }
            default -> System.out.println("지원하지 않는 기호입니다.");
        }


    }
}
