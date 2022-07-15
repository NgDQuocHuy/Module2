import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chào mừng bạn đến với chúng tôi");

        int choice = -1;
        Scanner input = new Scanner(System.in);

        Home();
        System.out.print("Nhập sự lựa chọn của bạn: ");

        while (choice != 0) {
                choice = input.nextInt();
                switch (choice) {

                    case 1:
                        ManageStudent();
                        System.out.print("Nhập sự lựa chọn của bạn: ");
                        int choice1 = -1;
                        choice1 = input.nextInt();

                        if (choice1 == 3) {
                            Home();
                            System.out.print("Nhập sự lựa chọn của bạn: ");
                        }
                        else {
                            ManageStudent();
                            System.out.print("Lựa chọn sai, Vui lòng nhập lại lựa chọn: ");
                        }
                        break;

                    case 2:
                        ManageScore();
                        System.out.print("Nhập sự lựa chọn của bạn: ");
                        int choice2 = -1;
                        choice2 = input.nextInt();

                        if (choice2 == 4) {
                            Home();
                            System.out.print("Nhập sự lựa chọn của bạn: ");
                        }
                        else {
                            ManageScore();
                            System.out.print("Lựa chọn sai, Vui lòng nhập lại lựa chọn2: ");
                        }
                        break;

                    default:
                        Home();
                        System.out.print("Lựa chọn sai, Vui lòng nhập lại lựa chọn3: ");
                }
            }
    }

    public static void Home() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                Trang chủ                  *");
        System.out.println("*          1. Quản lý học sinh              *");
        System.out.println("*          2. Quản lý điểm học sinh         *");
        System.out.println("*                                           *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
    }

    public static void ManageStudent() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                Quản lý học sinh           *");
        System.out.println("*          1. Thêm học sinh                 *");
        System.out.println("*          2. Xóa học sinh                  *");
        System.out.println("*          3. Trở lại Trang Chủ             *");
        System.out.println("*                                           *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
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
    }
}