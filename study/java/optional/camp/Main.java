package optional.camp;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();

        Optional<Student> box = CampService.findStudentByName(name);
        if (box.isPresent()) {
            System.out.println(box.get().getName() + " 학생은 캠프에 있습니다.");
        } else {
            System.out.println("학생은 캠프에 없습니다.");
        }
    }
}
