import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter design patter: Students list");
        List<Student> students = new ArrayList<Student>();

        CollegeStudent collegeStudent = new CollegeStudent("x", "y", "z");
        SchoolStudent schoolStudent = new SchoolStudent("a", "b", "c");

        students.add(collegeStudent);
        /**
         * We cannot do `students.add(schoolStudent);`
         * but we want to. So, we use an adapter.
         */

        students.add(new StudentAdapter(schoolStudent));

        for (Student student: students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getEmailAddress());
        }
    }
}