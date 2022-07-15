public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {9, 5, 8, 1, 3, 6, 7, 4, 2};
        int pos, x;

        System.out.println("Mảng trước khi sắp xếp:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            for (; pos > 0 && x < array[pos - 1]; pos--) {
                array[pos] = array[pos - 1];
            }
            array[pos] = x;
        }

        System.out.println();
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}