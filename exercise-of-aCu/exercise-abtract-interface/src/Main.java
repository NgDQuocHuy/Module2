import animal.*;
import machinee.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Con Chim");
        Bird bird = new Bird();
        System.out.println(bird);

        System.out.println("Con Chó");
        Dog dog = new Dog();
        System.out.println(dog);

        System.out.println("Con Cá");
        Fish fish = new Fish();
        System.out.println(fish);

        System.out.println("Xe Ô tô");
        Car car = new Car();
        System.out.println(car);

        System.out.println("Con Cá");
        Plane plane = new Plane();
        System.out.println(plane);
    }
}
