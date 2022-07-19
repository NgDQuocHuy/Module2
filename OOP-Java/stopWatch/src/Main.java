public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        long[] Array = new long[100000];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (long) (Math.random() * 100);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(Array);
        stopWatch.stop();
        System.out.println("Run time Selection Sort for 100.000 element: " + stopWatch.getElapsedTime() + " milisecond.");
    }

    public static void selectionSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            long min = array[i];
            int pos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}