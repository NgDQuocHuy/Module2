package animal;

import actInterface.*;



public class Dog extends Animal implements Runable, Barkable {

    @Override
    public String bark() {
        return "Tao sủa Gâu Gâu.";
    }

    @Override
    public String run() {
        return "Tao chạy vẫy đuôi.";
    }

    @Override
    public String toString() {
        return run() + " " + bark();
    }
}
