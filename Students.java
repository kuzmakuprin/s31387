import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> sList = new ArrayList<>();

    public static void addStudent(Student student) {
        sList.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : sList) {
            student.promote();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : sList) {
            Student.displayStudentInfo(student);
        }
    }
}