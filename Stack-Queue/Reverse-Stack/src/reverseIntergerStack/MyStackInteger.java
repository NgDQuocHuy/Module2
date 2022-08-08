package reverseIntergerStack;

import java.util.*;

public class MyStackInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số  lượng phần tử: ");
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element[" + i + "]");
            array[i] = input.nextInt();
            stack.push(array[i]);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
