package lambda;

public class AnonymousPractice {

    public static void main(String[] args) {

        Calculator sum1 = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(sum1.calculate(10,3));
    }
}
