public class Animal implements Comparable<Animal> {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
public int a;
    @Override
    public int compareTo(Animal o) {
        a = this.weight - o.weight;
        return a;
    }
    public String check() {
        if (a == 0) {
            return " đánh hòa ";
        }
        if (a > 0) {
            return " đánh ăn ";
        }
        else
            return " đánh thua ";
    }
}
