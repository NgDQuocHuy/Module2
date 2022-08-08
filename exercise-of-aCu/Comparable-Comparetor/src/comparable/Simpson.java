package comparable;

public class Car implements Comparable<Car> {
    private  name;

    public Car( T o) {
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public int compareTo(Car<T> o) {
        return <T>this.getName().compareTo(o.getName());
    }
}
