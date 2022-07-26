package circleAndCylinder;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hình tròn có tham số mặc định:");
        Circle circle = new Circle();
        System.out.println(circle);

        System.out.println("\nHình tròn có truyền tham số mới:");
        circle = new Circle(2);
        System.out.println(circle);

        System.out.println("\nHình Trụ");

        System.out.println("Hình trụ có tham số mặc định:");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        System.out.println("\nHình trụ có truyền tham số mới:");
        cylinder = new Cylinder(6,4);
        System.out.println(cylinder);
    }
}
