import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chào mừng bạn đến với chúng tôi");

        Menu();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    ManageStudent();
                    int choice1 = -1;
                    choice1 = input.nextInt();
                    switch (choice1) {
                        case 3:
                            Menu();

                    }
                    break;
                case 2:
                    ManageScore();
                    int choice2 = -1;
                    choice2 = input.nextInt();
                    switch (choice2) {
                        case 4:
                            Menu();
                    }
            }
        }
    }

    public static void Menu() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                Trang chủ                  *");
        System.out.println("*          1. Quản lý học sinh              *");
        System.out.println("*          2. Quản lý điểm học sinh         *");
        System.out.println("*                                           *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter choice: ");
    }

    public static void ManageStudent() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                Quản lý học sinh           *");
        System.out.println("*          1. Thêm học sinh                 *");
        System.out.println("*          2. Xóa học sinh                  *");
        System.out.println("*          3. Trở lại Trang Chủ             *");
        System.out.println("*                                           *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter choice");
    }

    public static void ManageScore() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                Quản lý điểm học sinh      *");
        System.out.println("*          1. Thêm điểm                     *");
        System.out.println("*          2. Sửa điểm                      *");
        System.out.println("*          3. Xóa điểm                      *");
        System.out.println("*          4. Trở lại trang chủ             *");
        System.out.println("*                                           *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Enter choice");
    }
}