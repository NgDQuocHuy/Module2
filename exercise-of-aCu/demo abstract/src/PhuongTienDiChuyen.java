abstract class Animal {
//    Lớp con phải kế thừa hết abstract của lớp cha
    abstract void makeSound();
    private String color = "Red";
    public void displayInfo() {
        System.out.println("I am an animal.");
    }

    Animal(String color) {
        this.color = color;
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tôi là chó Cái");
    }
    Dog() {
        super("Blue");
    }
}
class Main {
    public static void main(String[] args) {
//        Không thể tạo ra đối tượng cho Class trừu tượng
        Animal a1;
//        Nếu cố tạo sẽ bị lỗi biên dịch
//        Animal a2 = new Animal();
        Dog d1 = new Dog();
        d1.displayInfo();
        d1.makeSound();
    }
}
