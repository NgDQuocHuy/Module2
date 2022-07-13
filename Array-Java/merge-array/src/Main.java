import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//      Khai báo và khởi tạo giá trị của các phần tử mảng 1 và mảng 2
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
//      Biến length bằng tổng length 1 và length 2
        int length = array1.length + array2.length;

        int[] array3 = new int[length];
        int pos = 0;
//      Sử dụng vòng lặp for để lưu các phần tử
        for (int i = 0; i < array1.length; i++) {
            array3[pos] = array1[i];
            pos++;
        }

        for (int i = 0; i < array2.length; i++) {
            array3[pos] = array2[i];
            pos++;
        }
        System.out.println("Mảng 1 trước khi gộp:");
        System.out.println(Arrays.toString(array1));
        System.out.println("Mảng 2 trước khi gộp:");
        System.out.println(Arrays.toString(array2));
        System.out.println("Mảng sau khi gộp:");
        System.out.println(Arrays.toString(array3));


    }
}