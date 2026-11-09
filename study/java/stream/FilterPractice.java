package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPractice {

    static List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    public static void main(String[] args) {

        evenByLambda();
        evenByAnonymous();
        evenByLambdaVariable();

    }

    public static void evenByLambda() {
        List<Integer> evenNumberList = numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(evenNumberList);
    }

    public static void evenByAnonymous() {

        Predicate<Integer> isEven = new Predicate<>() {
            @Override
            public boolean test(Integer num) {
                return num % 2 == 0;
            }
        };

        List<Integer> evenNumberList = numbers
                .stream()
                .filter(isEven)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(evenNumberList);
    }

    public static void evenByLambdaVariable() {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumberList = numbers
                .stream()
                .filter(isEven)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(evenNumberList);
    }

}
