package MoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        System.out.println("Point");
        System.out.println("Point có mảng là:");
        Point point = new Point(3, 5);
        System.out.println(point);

        System.out.println("\nMoveablePoint");
        System.out.println("MoveablePoint có Speed là:");
        MoveablePoint moveablePoint = new MoveablePoint(5, 7);
        System.out.println(moveablePoint);
        System.out.println("\nMoveablePoint có Speed và Super là:");
        moveablePoint = new MoveablePoint(3, 4, 5, 7);
        System.out.println(moveablePoint);
        moveablePoint.move(3, 4);
        System.out.println("X sau khi Move: " + moveablePoint.getX());
        System.out.println("X sau khi Move: " + moveablePoint.getY());
    }
}
