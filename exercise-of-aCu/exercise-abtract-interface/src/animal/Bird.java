package animal;

import actInterface.Flyable;

public class Bird extends Animal implements Flyable {

    @Override
    public String fly() {
        return "Tao đập cánh Tao bay.";
    }

    @Override
    public String toString() {
        return fly();
    }
}
