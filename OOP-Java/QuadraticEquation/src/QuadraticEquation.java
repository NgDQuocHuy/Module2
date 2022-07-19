public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public double getRoot12() {
        return -b / (2 * a);
    }
    public String getResult() {
        double delta = getDiscriminant();
        if (delta > 0) {
            return "Result:\nx1 = " + getRoot1() + "\n" + "x2 = " + getRoot2();
        } else if (delta == 0) {
            return "Result:\n x1 = x2 =" + getRoot12();
        } else {
            return "Result:\n The equation has no real root.";
        }
    }

}
