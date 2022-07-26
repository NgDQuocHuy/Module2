package shape;

public class RectangleTest {
    public static void main(String[] args) {
        System.out.println("Ractangle không có tham số:");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        System.out.println("Rectangle có 2 tham số:");
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        System.out.println("Rectangle có 2 tham số và xài Super:");
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
