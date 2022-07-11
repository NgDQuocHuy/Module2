import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] studens = {"Dũng", "Khoa", "Nhân", "Huy", "Nhật", "Nam", "Nhi"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's Student: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;

        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is " + i);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}