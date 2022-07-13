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

        int rowTotal = 0;
        int colTotal = 0;
        int total = 0;

        for (int i = 0; i < row; i++) {
            total += arrayN[colTotal][rowTotal];
            rowTotal++;
            colTotal++;
        }
        System.out.print("Tổng phẩn tử chéo của mảng từ trái sang phải là: " + total + "\n");

        int i;
        int j;
        int total2 = 0;
        System.out.println(row);
        for (i = 0, j = col-1; i < row && j >= 0; i++, j--) {
            total2 += arrayN[i][j];

        }
        System.out.print("Tổng phẩn tử chéo của mảng từ phải sang trái là: " + total2 + "\n");
    }
}