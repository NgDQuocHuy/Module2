package employee;

import java.time.LocalDate;

public class Experience extends Employee{
    private String experience = "Experience";
    private int explnYear;
    private String proSkill;

    public int getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public Experience(int id, String fullName,
                      LocalDate birthDay, String phone,
                      String email, int explnYear,
                      String proSkill) {
        super(id, fullName, birthDay, phone, email);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Chức vụ      : "
                + experience
                + "\n- Kinh nghiệm  : "
                + explnYear
                + " năm"
                + "\n- Kỹ năng      : "
                + proSkill;
    }
}
