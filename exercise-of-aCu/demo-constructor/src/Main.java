public class Main {
//      Constructor Overloading (Nạp chồng) trong Java
}
class Student {

    int id;
    String name;
    int age;
    String clas;

    // Student có 2 tham số
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Student có 3 tham số
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // Student có 4 tham số
    public Student(int id, String name, int age, String clas) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.clas = clas;
    }

    // Phương thức hiển thị
    void display() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + clas);
    }


    public static void main(String[] args) {
        // Tạo đối tượng và truyền vào 2 tham số
        Student s1 = new Student(01, "Nguyễn Đình Quốc Huy");

        // Tạo đối tượng và truyền vào 3 tham số
        Student s2 = new Student(02, "Quốc Huy Nguyễn Đình", 23);

        // Tạo đối tượng và truyền vào 4 tham số
        Student s3 = new Student(03, "Nguyễn Đình Huy Quốc", 22, "C0522K1");

        System.out.println("Student với 2 tham số:");
        s1.display();
        System.out.println("Student với 3 tham số:");
        s2.display();
        System.out.println("Student với 4 tham số:");
        s3.display();
    }
}