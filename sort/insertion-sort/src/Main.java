import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];

        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            list[i] = scanner.nextInt();
        }

        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int k;
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            System.out.println("Insert " + currentElement + " into positon " + list[k + 1] + " in the list and " + list[k + 1] + " increase by 1.");
            list[k + 1] = currentElement;
        }

        System.out.println("The current list is: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();

    }
}