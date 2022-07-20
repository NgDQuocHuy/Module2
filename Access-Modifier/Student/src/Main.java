public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student();
        student.setName("Huy");
        student.setClasses("C05");
        System.out.println(student.name);
        System.out.println(student.classes);
    }
}