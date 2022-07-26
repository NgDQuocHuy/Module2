package point2DAndPoint3D;

public class TestPoint {
    public static void main(String[] args) {
        System.out.println("point2D");
        System.out.println("\nPoint2D có tham số:");
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);

        System.out.println("Point3D có tham số:");
        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println(point3D);
    }
}
