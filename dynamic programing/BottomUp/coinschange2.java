package BottomUp;

public class coinschange2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 };
        int sum = 11;
        System.out.println(coinChange(arr, sum));
    }

    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        for (int j = 0; j <= amount; j++) {
            dp[0][j] = (int) (1e9);
        }
        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0) {
                dp[1][j] = j / coins[0];
            } else {
                dp[1][j] = (int) (1e9);
            }
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        if (dp[coins.length][amount] >= (int) (1e9)) {
            return -1;
        }
        return dp[coins.length][amount];
    }
}
