package animal;

import actInterface.Swimable;

public class Fish extends Animal implements Swimable {

    @Override
    public String swim() {
        return "Đuôi tao quẩy Tao bơi bơi.";
    }

    @Override
    public String toString() {
        return swim();
    }
}
