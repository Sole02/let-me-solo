package lambda;

public class LambdaPractice {

    public static void main(String[] args) {
        Checker isPositive = c -> c > 0;

        System.out.println(isPositive.check(5));
        System.out.println(isPositive.check(-3));

        Calculator sum = (a, b) -> a + b;
        Calculator minus = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println(sum.calculate(10, 3));
        System.out.println(minus.calculate(10, 3));
        System.out.println(multiply.calculate(10, 3));

        Calculator sum2 = (a, b) -> {
            return a + b;
        };

        System.out.println(sum2.calculate(10, 3));

        Calculator minus2 = (int a, int b) -> {
            return a - b;
        };

        System.out.println(minus2.calculate(10, 3));

        Calculator divide = (int a, int b) -> {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return a / b;
        };

        System.out.println(divide.calculate(10, 2));
        System.out.println(divide.calculate(10, 0));

    }
}
