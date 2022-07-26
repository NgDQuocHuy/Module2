package circleAndCylinder;

public class Cylinder extends Circle {
    private double height = 3;

    public Cylinder () {}

    public Cylinder (double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString()
                + " and Cylinder with height = "
                + getHeight()
                + ". Volume Cylinder = "
                + getVolume();
    }
}
