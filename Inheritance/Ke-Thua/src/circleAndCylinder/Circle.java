package circleAndCylinder;

public class Circle {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", Area Circle = "
                + getArea()
                + " and Perimeter = "
                + getPerimeter();
    }
}
