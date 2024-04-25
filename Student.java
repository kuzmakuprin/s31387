import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private static int studentCount = 0;
    private String studentNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Date dateOfBirth;
    private StudyProgramme programme;
    private Map<String, Integer> grades;
    private int currentSemester;

    public Student(String firstName, String lastName, String email, String address, String phone, Date dateOfBirth) {
        this.studentNumber = "s" + (++studentCount);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.grades = new HashMap<>();
        this.currentSemester = 1;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void enrollStudent(StudyProgramme programme) {
        this.programme = programme;
    }
    public void addGrade(int grade, String courseCode) {
        grades.put(courseCode, grade);
    }
    public void promote() {
        this.currentSemester++;
    }
    public static void displayStudentInfo(Student student) {
        System.out.println("Student Number: " + student.studentNumber);
        System.out.println("Name: " + student.firstName + " " + student.lastName);
        System.out.println("Email: " + student.email);
        System.out.println("Address: " + student.address);
        System.out.println("DOB: " + student.dateOfBirth);
        System.out.println("Current Semester: " + student.currentSemester);
        System.out.println("Grades: " + student.grades);
        if (student.programme != null) {
            System.out.println("Programme: " + student.programme.getName());
        }
    }
}
