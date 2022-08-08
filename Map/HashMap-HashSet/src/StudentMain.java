import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "Hà Nội");
        Student student2 = new Student("Hưng", 21, "Huế");
        Student student3 = new Student("Hà", 22, "Sài Gòn");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("........Set\n");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
