package BottomUp;

public class equalsumpartition {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 9, 10, 2 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(solve(arr, sum));
    }

    public static boolean solve(int[] arr, int sum) {
        int n = arr.length;
        if (sum % 2 != 0)
            return false;
        int newsum = sum / 2;
        boolean[][] dp = new boolean[n + 1][newsum + 1];
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
        return dp[n][newsum];
    }

}
