package Shape;

public class SquareTest {
    public static void main(String[] args) {
        System.out.println("Square không có tham số:");
        Square square = new Square();
        System.out.println(square);

        System.out.println("Square có 1 tham số:");
        square = new Square(4);
        System.out.println(square);

        System.out.println("Square có 1 tham số và xài Super:");
        square = new Square(3, "yellow", false);
        System.out.println(square);
    }
}
