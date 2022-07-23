public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fan fan = new Fan();
        Fan fan1 = new Fan();
        fan.setSpeed(fan.Fast);
        fan.setRadius(10.0);
        fan.setColor("Yellow");
        System.out.println("fan: " + fan);
        System.out.println("fan 1: " + fan1);
    }
}