package employee;

import java.time.LocalDate;

public class Fresher extends Employee{
    private String fresher = "Fresher";
    private LocalDate graduation_date;
    private String graduation_rank;
    private String education;

    public LocalDate getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(LocalDate graduation_date) {
        graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        education = education;
    }

    public Fresher(int id, String fullName, LocalDate birthDay, String phone, String email, String education, String graduation_rank, LocalDate graduation_date) {
        super(id, fullName, birthDay, phone, email);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n- Chức vụ      : "
                + fresher
                + "\n- Education    : "
                + education
                + "\n- Xếp Loại     : "
                + graduation_rank
                + "\n- Thời gian tốt nghiệp: "
                + graduation_date;
    }
}
