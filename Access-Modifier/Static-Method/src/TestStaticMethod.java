public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); // Gọi phương thức change()
//        Tạo các đối tượng
        Student student1 = new Student(111, "Hoàng");
        Student student2 = new Student(222, "Khánh");
        Student student3 = new Student(333, "Nam");

//        Gọi phương thức display()
        student1.display();
        student2.display();
        student3.display();
    }
}
