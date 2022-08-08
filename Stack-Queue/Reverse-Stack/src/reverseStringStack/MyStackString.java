package reverseStringStack;

import java.util.Scanner;
import java.util.Stack;

public class MyStackString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = input.nextLine();

        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            str1 += str.charAt(i);
        }

        System.out.println(stack);
        System.out.println(str1);
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += stack.pop();
        }
        System.out.println(str2);
    }
}
