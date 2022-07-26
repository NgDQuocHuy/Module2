import animal.*;
import fruit.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAnimal kêu sao ?");
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        System.out.println("\nCon gà ăn thế nào ?");
        Chicken chicken = new Chicken();
        System.out.println(chicken.howtoEat());

        System.out.println("\nTrái cây ăn thế nào ?");
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
