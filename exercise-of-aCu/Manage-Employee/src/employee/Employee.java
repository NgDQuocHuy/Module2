package employee;


import java.time.LocalDate;

public abstract class EmployeeList {
    private Employee[] employees = new Employee[10];
    private int nextIndex = 0;
    private int id;
    private String fullName;
    private LocalDate birthDay;
    private String phone;
    private String email;
    private String employee_type;
    private int employee_count;

    public EmployeeList(int id, String fullName,
                    LocalDate birthDay, String phone,
                    String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;

    }

    public Employee get(int index) {
        return this.employees[index];
    }

    public void add(Employee employee) {
        if (nextIndex < employees.length) {
            employees[nextIndex] = employee;
            System.out.println("Employee added at " + nextIndex);
            nextIndex++;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    @Override
    public String toString() {
        return "+ Nhân viên    : "
                + fullName
                + "\n- Id nhân viên : "
                + id
                + "\n- Birth Day    : "
                + birthDay
                + "\n- Phone        : "
                + phone
                + "\n- Email        : "
                + email;
    }
}
