import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayN = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = 9;
        int i, c;
        System.out.println("Phần tử có trong mảng: ");
        for (i = 0; i < arrayN.length; i++) {
            System.out.print(arrayN[i] + "\t");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập phần tử muốn xóa: ");
        int element = scanner.nextInt();

        for (i = 0; i < size; i++) {
            if (arrayN[i] ==element) {
                System.out.println("Phần tử " + element + " muốn xóa nằm tại vị trí " + i + ".");
            }
        }
        for (c = i = 0; i < size; i++) {
            if (arrayN[i] != element) {
                arrayN[c] = arrayN[i];
                c++;
            }
        }
        size = c;

        System.out.println("Mảng sau khi xóa phần tử: " + element);
        for (i = 0; i < size; i++) {
            System.out.print(arrayN[i] + "\t");
        }
    }
}