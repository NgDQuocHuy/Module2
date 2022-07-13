import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một đoạn văn bản: ");
        String para = input.nextLine();
        System.out.println("Nhập ký tự muốn tìm: ");
        String charac = input.nextLine();
        int count = 0;

        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == charac.charAt(0)) {
                count++;
            }
        }

        System.out.println("Số lần xuất " + charac + " trong chuỗi là: " +count);
    }
}