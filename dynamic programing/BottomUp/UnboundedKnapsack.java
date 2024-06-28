package BottomUp;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int[] wt = { 1, 2, 5, 3 };
        int[] val = { 5, 7, 29, 1 };
        int w = 10;
        System.out.println(solve(wt, val, w));
    }

    public static int solve(int[] wt, int[] val, int w) {
        int n = wt.length;

        int[][] dp = new int[n + 1][w + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i][j - wt[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }
}
