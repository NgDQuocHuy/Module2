package DemoKeThua;

public class ClassSonOfFather extends ClassFather {
    public String School;


    @Override
    public void enterInfo() {
        super.enterInfo();
        System.out.println("em là huy");
    }

    public ClassSonOfFather(String school) {

        this.School = school;
    }
}
