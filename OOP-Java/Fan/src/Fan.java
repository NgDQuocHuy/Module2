public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;

    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public void getOn() {
        this.on = true;
    }

    public int getSlow() {
        this.on = true;
        return Slow;
    }

    public int getMedium() {
        this.on = true;
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (on) {
            return "Speed: " + getSpeed() + ", Color: " + getColor() + ", Radius: " + getRadius() + ", fan in on";
        } else {
            return "Color: " + getColor() + ", Radius: " + getRadius() + ", fan in off";
        }
    }
}
