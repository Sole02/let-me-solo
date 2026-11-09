package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    static List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    static List<String> names = new ArrayList<>(List.of("kim", "lee", "park", "choi"));

    public static void main(String[] args) {

        plusOne();
        over5();
        oddSquare();
        upperCaseNames();
        times10();

    }

    public static void plusOne() {

        List<Integer> plusOneList = numbers
                .stream()
                .map(num -> num + 1)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(plusOneList);
    }

    public static void over5() {

        List<Integer> over5List = numbers
                .stream()
                .filter(num -> num > 5)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(over5List);
    }

    public static void oddSquare() {
        List<Integer> oddSquareList = numbers
                .stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * num)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(oddSquareList);
    }

    public static void upperCaseNames() {
        List<String> upperCaseNamesList = names
                .stream()
                .filter(name -> name.length() >= 4)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(upperCaseNamesList);
    }

    public static void times10() {
        List<Integer> times10List = numbers
                .stream()
                .map(num -> num * 10)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(times10List);
    }

}
