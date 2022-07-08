import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int choice = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter length: ");
            int length = input.nextInt();
            System.out.println("Enter width: ");
            int width = input.nextInt();
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= length; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        if (choice == 2) {
            System.out.println("Print the square triangle");
            System.out.println("1. Top-Left");
            System.out.println("2. Botton-Left");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            int choice_2 = input.nextInt();
            if (choice_2 == 1) {
                System.out.println("Enter height: ");
                int height = input.nextInt();
                for (int i = height; i >= 1 ; --i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            } else if (choice_2 == 2) {
                System.out.println("Enter height: ");
                int height = input.nextInt();
                for (int i = 1; i <= height; ++i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            } else if (choice_2 == 0) {
                System.exit(0);
            } else {
                System.out.println("No choice!");
            }

        }
        if (choice == 3) {
            System.out.println("Enter height: ");
            int height = input.nextInt();
            int k = 0;
            for (int i = 1; i <= height; ++i, k = 0) {
                for (int j = 1; j <= height - 1; ++j) {
                    System.out.print("  ");
                }
                while (k != 2 * i -1) {
                    System.out.print(" * ");
                    ++k;
                }
                System.out.println();
            }
        }
    }
}