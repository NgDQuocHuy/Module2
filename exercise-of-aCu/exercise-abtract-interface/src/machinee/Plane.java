package machinee;

import actInterface.Flyable;

public class Plane extends Machine implements Flyable {

    @Override
    public String fly() {
        return "Bay lên trên bầu trời rồi nhẹ nhàng bay lên.";
    }

    @Override
    public String toString() {
        return fly();
    }
}
