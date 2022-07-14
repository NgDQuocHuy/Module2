public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int curentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    curentMinIndex = j;
                }
            }

            if (curentMinIndex != i) {
                list[curentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}