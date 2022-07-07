import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Nhập n số nguyên tố đầu tiên: ");
        number = scanner.nextInt();

        int count = 0;
        int countPrime = 0;

        for (int i = 2; i < 1000; i++) {
            if (countPrime < number) {
                for (int j = 1; j <=i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countPrime += 1;
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}