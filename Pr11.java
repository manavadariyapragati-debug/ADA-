import java.util.*;

public class Pr11 {
    public static void main(String[] args) {
        int[] p = {1, 2, 3, 4};
        int n = p.length - 1;

        int[][] m = new int[n][n];

        for (int L = 2; L <= n; L++) {
            for (int i = 0; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i] * p[k + 1
