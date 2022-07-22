package Shape;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Shape không có tham số:");
        Shape shape = new Shape();
        System.out.println(shape);

        System.out.println("Shape có tham số:");
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
