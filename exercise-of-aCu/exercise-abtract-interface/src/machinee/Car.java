package machinee;

import actInterface.Runable;

public class Car extends Machine implements Runable {

    @Override
    public String run() {
        return "Bốn bánh xe chạy bon bon.";
    }

    @Override
    public String toString() {
        return run();
    }
}
