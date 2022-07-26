package triangle;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public double P = getPerimeter();
    public double S = getArea();
    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        return Math.sqrt(P * (P * side1) * (P * side2) * (P * side3));
    }

    @Override
    public String toString() {
        return "Tam giá có 3 cạnh a, b, c lần lượt là: " +
                "\n" + side1 + ", " + side2 + ", " + side3 +
                "\nChu vi của hình Tam Giác là: " + P +
                "\nDiện tích của hình Tam Giác là: " + S;
    }
}
