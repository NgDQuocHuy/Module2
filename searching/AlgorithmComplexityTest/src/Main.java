import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
//            Tìm vị trí tương ứng của ký tự trong bảng ASCII
            int ascii = inputString.charAt(i);
//            Tăng giá trị tần suất
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}