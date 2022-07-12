import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int[] arrayN = new int[size];
        arrayN[0] = 1;
        arrayN[1] = 2;
        arrayN[2] = 3;
        arrayN[3] = 4;
        arrayN[4] = 5;
        arrayN[5] = 6;
        arrayN[6] = 7;
        int n = 7;
        System.out.println("arrayN trước khi thêm");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayN[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập phần tử muốn thêm: ");
        int X = scanner.nextInt();
        n = insert(arrayN, size, n, X);
        System.out.println("Sau khi thêm" + X);
        for (int i = 0; i < n; i++) {
            System.out.print(arrayN[i] + "\t");
        }

    }
    public static int insert(int[] arrayN, int size, int n, int X) {
        if ( n >= size) {
            return n;
        }
    arrayN[n] = X;
        return n + 1;
    }
}



