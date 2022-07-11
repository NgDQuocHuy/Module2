public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}