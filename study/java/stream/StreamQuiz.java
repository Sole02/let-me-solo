package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamQuiz {

    static List<Integer> scores = new ArrayList<>(List.of(45, 82, 67, 90, 38, 75, 100, 59));
    static List<String> fruits = new ArrayList<>(List.of("apple", "kiwi", "banana", "fig", "mango", "grape"));

    public static void main(String[] args) {

        atLeast60();
        plus5Points();
        upperCaseFruits();
        retakeScores();
        fiveLetterFruits();
        fruitLengths();
        atLeast80();
        gradeA();
        countAtLeast60();

    }

    public static void atLeast60() {
        List<Integer> atLeast60List = scores
                .stream()
                .filter(score -> score >= 60)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(atLeast60List);
    }

    public static void plus5Points() {
        List<Integer> plus5PointsList = scores
                .stream()
                .map(score -> score + 5)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(plus5PointsList);
    }

    public static void upperCaseFruits() {
        List<String> upperCaseFruitsList = fruits
                .stream()
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(upperCaseFruitsList);
    }

    public static void retakeScores() {
        List<Integer> retakeScoresList = scores
                .stream()
                .filter(score -> score < 60)
                .map(score -> score + 10)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(retakeScoresList);
    }

    public static void fiveLetterFruits() {
        List<String> fiveLetterFruitsList = fruits
                .stream()
                .filter(fruit -> fruit.length() == 5)
                .map(fruit -> fruit + "!")
                .collect(Collectors.toUnmodifiableList());

        System.out.println(fiveLetterFruitsList);
    }

    public static void fruitLengths() {
        List<Integer> fruitLengthsList = fruits
                .stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(fruitLengthsList);
    }

    public static void atLeast80() {

        Predicate<Integer> isAtLeast80 = new Predicate<>() {
            @Override
            public boolean test(Integer score) {
                return score >= 80;
            }
        };

        List<Integer> atLeast80List = scores
                .stream()
                .filter(isAtLeast80)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(atLeast80List);
    }

    public static void gradeA() {
        List<String> gradeAList = scores
                .stream()
                .filter(score -> score >= 90)
                .map(score -> score + "점 A")
                .collect(Collectors.toUnmodifiableList());

        System.out.println(gradeAList);
    }

    public static void countAtLeast60() {
        long countAtLeast60 = scores
                .stream()
                .filter(score -> score >= 60)
                .count();

        System.out.println(countAtLeast60);
    }

}
