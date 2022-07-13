public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {5, 9, 10, 1, 88, 15, 26};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}