import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Anh", 38, "HT" );
        Student student4 = new Student("Tung", 38, "HT" );

        List<Student> students = new ArrayList<>();
        students.add( student1 );
        students.add( student2 );
        students.add( student3 );
        students.add( student4 );

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(students, ageComparator);
        System.out.println("So sánh theo tuổi: \n");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
