import java.util.*;

public class Pr01 {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000);
        }

        long start = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        long end = System.nanoTime();

        System.out.println("Execution Time (nanoseconds): " + (end - start));
    }
}

/*
Output:
Execution Time (nanoseconds): 185432100
*/
