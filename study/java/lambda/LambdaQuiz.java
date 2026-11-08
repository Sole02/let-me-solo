package lambda;

public class LambdaQuiz {

    public static void main(String[] args) {
        Checker isOdd = c -> {
            if (c % 2 != 0) {
                System.out.println("홀수입니다.");
                return true;
            }
            System.out.println("짝수입니다.");
            return false;
        };

        System.out.println(isOdd.check(10));
        System.out.println(isOdd.check(25));


        Checker isTen = c -> {
            if (c == 10) {
                System.out.println("10입니다.");
                return true;
            }
            System.out.println("10이 아닙니다.");
            return false;
        };

        System.out.println(isTen.check(7));
        System.out.println(isTen.check(10));

        System.out.println(isOdd.isNot(7));


        StringChanger addHello = name -> {
            return "Hello, " + name;
        };

        System.out.println(addHello.change("kim"));


        StringChanger toUpper = str -> {
            return str.toUpperCase();
        };

        System.out.println(toUpper.change("java"));


        Calculator max = (a, b) -> {
            if (a < b) {
                return b;
            }
            return a;
        };

        System.out.println(max.calculate(3, 8));
        System.out.println(max.calculate(10, 2));


        Checker isAGrade = score -> {
            if (score >= 90) {
                System.out.println("A등급");
                return true;
            }
            System.out.println("통과 못함");
            return false;
        };

        System.out.println(isAGrade.check(95));
        System.out.println(isAGrade.check(85));

    }
}
