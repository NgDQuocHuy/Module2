import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        int min, max;
        int sum = 0;

        System.out.println("Nhập min: ");
        min = scanner.nextInt();
        System.out.println("Nhập max: ");
        max = scanner.nextInt();

        if (max == 0) {
            System.out.println(max + "= 0 là sai");
            return;
        }
        if (min > max) {
            System.out.println(min + " Lớn hơn " + max + " là sai.");
            return;
        }
        for (int i = min; i <= max; i++) {
            sum = sum + (i * i);
        }
        System.out.println("Tổng bình phương của các số từ " + min + " đến " + max + " là " + sum);
    }
}