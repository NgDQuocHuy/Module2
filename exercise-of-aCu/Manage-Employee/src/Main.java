import employee.Employee;
import employee.Experience;
import employee.Fresher;
import employee.Intern;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee employee = new Experience(02,"Nguyễn Đình Quốc Huy", LocalDate.parse("1998-12-24"),
                                        "0397502235","NgDQuocHuy241@gmail.com",3,"Học giỏi");
        System.out.println(employee);

        Employee employee1 = new Fresher(03,"Quốc Huy Nguyễn Đình", LocalDate.parse("1999-01-24"),
                                        "0397502235", "huyndqgcd17165@fpt.edu.vn", "CodeGym",
                                        "Bạc", LocalDate.parse("2022-12-24"));
        System.out.println("\n" + employee1);

        Employee employee2 = new Intern(04, "Nguyễn Huy", LocalDate.parse("1999-12-24"),
                                        "0397502235", "nguyenhuy951999@gmail.com", "CodeGym",
                                        "Lập trình viên", "Module 2");
        System.out.println("\n" + employee2);
    }
}