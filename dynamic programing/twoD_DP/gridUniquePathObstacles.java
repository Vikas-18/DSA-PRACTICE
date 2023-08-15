package twoD_DP;

public class gridUniquePathObstacles {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        System.out.println(uniquePathsWithObstacles(arr));
    }

    public static int uniquePathsWithObstacles(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];

        if (arr[0][0] == 1 || arr[n - 1][m - 1] == 1) {
            return 0;
        }

        dp[n - 1][m - 1] = 1;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (arr[i][j] == 1) {
                    dp[i][j] = 0; // Obstacle, no paths through here
                } else {

                    if (i + 1 < m) {

                        dp[i][j] += dp[i + 1][j];
                    }
                    if (j + 1 < n) {
                        dp[i][j] += dp[i][j + 1];
                    }
                }
            }
        }

        return dp[0][0];
    }
}
