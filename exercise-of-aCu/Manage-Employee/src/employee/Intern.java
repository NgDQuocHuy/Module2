package employee;

import java.time.LocalDate;

public class Intern extends Employee {
    private String intern = "Intern";
    private String university_name;
    private String majors;
    private String semester;

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        university_name = university_name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        semester = semester;
    }

    public Intern(int id, String fullName, LocalDate birthDay, String phone, String email, String university_name, String majors, String semester) {
        super(id, fullName, birthDay, phone, email);
        this.university_name = university_name;
        this.majors = majors;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Chức vụ      : "
                + intern
                + "\n- Trường       : "
                + university_name
                + "\n- Chuyên ngành : "
                + majors
                + "\n- Học kì       : "
                + semester;
    }
}
