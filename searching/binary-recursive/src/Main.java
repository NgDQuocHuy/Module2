import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập size mảng: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập các phần phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử số " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Các phần tử của mảng: ");
        show(array);

        System.out.println("\nCác phần tử của mảng sau khi sắp xếp: ");
        selectionSort(array);
        show(array);

        int low = 0;
        int high = array.length - 1;
        System.out.print("\nNhập phần tử muốn tìm: ");
        int key = input.nextInt();
        int result = binarySearch(array, low, high, key);
        System.out.println("Phần tử " + key + " trong mảng nằm tại vị trí " + (result + 1));
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
    static int binarySearch(int[] array, int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == array[mid])
            return mid;
        if (key < array[mid])
            return binarySearch(array, low, mid - 1, key);
        return binarySearch(array, mid + 1, high, key);
    }
}