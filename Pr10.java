import java.util.*;

public class Pr10 {
    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1
