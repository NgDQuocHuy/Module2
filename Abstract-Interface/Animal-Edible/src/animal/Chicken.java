package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cục tác Cục tác";
    }


    @Override
    public String howtoEat() {
        return "Vặt lông quay và ăn.";
    }
}
