public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

//    Hàm khởi tạo để khởi tạo biến.
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

//    Phương thức Static change() để thay đổi giá trị của biến Static.
    static void change() {
        college = "CODEGYM";
    }

//    Phương thức display() để hiển thị giá trị.
    void display() {
        System.out.println(rollno + "\t" + name + "\t" + college);
    }
}
