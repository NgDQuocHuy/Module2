import employee.Employee;
import employee.Experience;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        Employee employee = new Experience(
                                        02,
                                    "Nguyễn Đình Quốc Huy",
                        LocalDate.parse("1999-12-24"),
                                        "0397502235",
                                        "NgDQuocHuy241@gmail.com",
                                        3,
                                        "Học giỏi");
        System.out.println(employee);
    }
}