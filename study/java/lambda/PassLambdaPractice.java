package lambda;

public class PassLambdaPractice {

    public static int calculate(int a, int b, Calculator calculator) {
        return calculator.calculate(a, b);
    }

    public static void main(String[] args) {

        Calculator cal1 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        Calculator cal2 = (a, b) -> {
            return a + b;
        };

        System.out.println(calculate(5, 5, (a, b) -> a + b));
        System.out.println(calculate(10, 3, (a, b) -> a - b));
        System.out.println(calculate(10, 3, (a, b) -> a * b));

        System.out.println(calculate(3, 3, cal1));
        System.out.println(calculate(4, 4, cal2));

    }
}
