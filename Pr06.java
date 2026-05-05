import java.util.*;

public class Pr06 {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int key1 = 30;
        int key2 = 45;

        System.out.println("Linear Search (30): " + linearSearch(arr, key1));
        System.out.println("Linear Search (45): " + linearSearch(arr, key2));

        System.out.println("Binary Search (30): " + binarySearch(arr, key1));
        System.out.println("Binary Search (45): " + binarySearch(arr, key2));
    }
}

/*
Output:
Linear Search (30): 2
Linear Search (45): -1
Binary Search (30): 2
Binary Search (45): -1
*/
