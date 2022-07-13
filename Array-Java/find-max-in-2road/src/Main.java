import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.println("Nhập vào số hàng của mảng 2 chiều: ");
        col = input.nextInt();
        System.out.println("Nhập vào số cột của mảng 2 chiều: ");
        row = input.nextInt();

        int arrayN[][] = new int[col][row];
        System.out.println("Nhập các phần tử của mảng 2 chiều: ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("arrayN[" + i + "][" + j + "] = ");
                arrayN[i][j] = input.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều sau khi nhập phần tử là: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arrayN[i][j] + "\t");
            }
            System.out.println();
        }

        int max = arrayN[0][0];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (max < arrayN[i][j]) {
                    max = arrayN[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng 2 chiều là: " + max);
    }
}