package DemoKeThua;

public class TestKeThua {
    public static void main(String[] args) {
        ClassFather classFather = new ClassFather("Huy", 24, "nam");
        ClassSonOfFather classSonOfFather = new ClassSonOfFather("Hung", 22, "nu", "c05");
        classFather.enterInfo();
        System.out.println();
        classSonOfFather.enterInfo();
    }
}
