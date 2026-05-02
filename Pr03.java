import java.util.*;

public class Pr03 {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000);
        }

        long start = System.nanoTime();

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        long end = System.nanoTime();

        System.out.println("Execution Time (nanoseconds): " + (end - start));
    }
}

/*
Output:
Execution Time (nanoseconds): 124876300
*/
