package BottomUp;

public class subsetsum {
    public static void main(String[] args) {
        int[] arr = { 12, 42, 63, 25 };
        int sum = 75;
        System.out.println(solve(arr, sum));
    }

    public static boolean solve(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
