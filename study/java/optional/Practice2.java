package optional;

import java.util.Optional;
import java.util.Scanner;

public class Practice2 {

    static String[] fruit = {"사과", "바나나", "포도"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("과일 이름을 입력하세요: ");
        Optional<String> fruitBox = findFruit(scanner.nextLine());

        if (fruitBox.isPresent()) {
            System.out.println("찾았습니다: " + fruitBox.get());
        } else {
            System.out.println("없습니다.");
        }
    }

    public static Optional<String> findFruit(String target) {

        for (int i = 0; i < fruit.length; i++) {
            if (target.equals(fruit[i])) {
                return Optional.ofNullable(fruit[i]);
            }
        }
        return Optional.ofNullable(null);
    }
}
