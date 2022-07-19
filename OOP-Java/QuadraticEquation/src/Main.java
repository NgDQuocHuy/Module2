import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Enter: " + quadraticEquation.getA() + "x2 + " + quadraticEquation.getB() + "x + " + quadraticEquation.getC() + " = 0");

        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        System.out.println(quadraticEquation.getResult());
    }
}