package DemoKeThua;

import java.util.Scanner;

public class ClassFather {
    private String name;
    private int age;
    private String gender;

    public void enterInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name Dad: ");
        name = input.nextLine();
        System.out.print("Enter age of Dad: ");
        age = input.nextInt();
        System.out.print("Enter gender of Dad: ");
        gender = input.nextLine();
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    public ClassFather() {

    }
    public ClassFather(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void toWork() {
        System.out.println("Bố mày đi làm");
    }
}
