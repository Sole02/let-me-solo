package optional;

import java.util.Optional;

public class Practice {

    static String[] names = {"Spartan", "Steve", "John"};

    public static void main(String[] args) {

        Optional<String> box = findName("Tom");

        if (box.isPresent()) {
            System.out.println("찾았습니다: " + box.get());
        } else {
            System.out.println("없습니다.");
        }
    }

    public static boolean hasName(String target) {

        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                return true;
            }
        }
        return false;
    }

    public static Optional<String> findName(String target) {
        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                return Optional.ofNullable(names[i]);
            }
        }
        return Optional.ofNullable(null);
    }
}