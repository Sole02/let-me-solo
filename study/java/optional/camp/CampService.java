package optional.camp;

import java.util.Optional;

public class CampService {

    private static Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };

    public static Optional<Student> findStudentByName(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return Optional.ofNullable(students[i]);
            }
        }
        return Optional.ofNullable(null);
    }
}
