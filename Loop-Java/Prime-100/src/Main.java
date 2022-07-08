public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int count = 0;
        int countPrime = 0;

        for (int i = 2; i < 100; i++) {
                for (int j = 1; j <=i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countPrime += 1;
                }
                count = 0;
        }
    }
}