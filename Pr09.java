import java.util.*;

public class Pr09 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }

        if (dp[amount] > amount) {
            System.out.println("No solution");
        } else {
            System.out.println("Minimum coins required: " + dp[
