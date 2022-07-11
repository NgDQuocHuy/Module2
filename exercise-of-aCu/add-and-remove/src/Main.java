import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào độ dài của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Mảng hiện tại có các phần tử là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        System.out.println();

        System.out.println("Nhập phần tử muốn xóa khỏi mảng: ");
        int element = scanner.nextInt();

        for (c = i = 0; i < n; i++) {
            if (A[i] != element) {
                A[c] = A[i];
                c++;
            }
        }

        n = c;  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa phần từ
        System.out.println("Mảng còn lại sau khi xóa phần tử " + element + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}