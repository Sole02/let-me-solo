package basic;

import java.util.ArrayList;
import java.util.List;

public class ForEachPractice {

    static List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    static List<String> names = new ArrayList<>(List.of("kim", "lee", "park", "choi"));

    public static void main(String[] args) {

        printAll();
        sum();
        printEven();
        times10();
        oddSquare();
        upperCaseNames();

    }

    public static void printAll() {
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }

    public static void sum() {
        int sum = 0;

        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void printEven() {
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void times10() {
        List<Integer> times10List = new ArrayList<>();

        for (Integer num : numbers) {
            times10List.add(num * 10);
        }
        System.out.println(times10List);
    }

    public static void oddSquare() {
        List<Integer> oddSquares = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 != 0) {
                oddSquares.add(num * num);
            }
        }
        System.out.println(oddSquares);
    }

    public static void upperCaseNames() {
        List<String> upperNames = new ArrayList<>();

        for (String name : names) {
            if (name.length() >= 4) {
                upperNames.add(name.toUpperCase());
            }
        }
        System.out.println(upperNames);
    }


}
