package DP_ON_STRING;
public class edit_distance {
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";

        // int[][] dp = new int[5][3];
        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // dp[i][j] = -1;
        // }
        // }

        System.out.println(tabulation(s1, s2));
    }

    public static int solve(String s1, String s2, int i, int j, int[][] dp) {
        // base case
        if (i < 0) {
            return j + 1;// because still s2 has some char and s1 is exhausted so we need to insert s2
                         // no. of char
        }

        if (j < 0) {
            return i + 1; // because still s1 is not exhausted and s2 has not any more char so delete that
                          // no. of chars from s1
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // matching happens
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = solve(s1, s2, i - 1, j - 1, dp);
        }

        // matching does not happen

        // insert
        int insert = 1 + solve(s1, s2, i, j - 1, dp);

        // delete
        int delete = 1 + solve(s1, s2, i - 1, j, dp);

        // replace

        int replace = 1 + solve(s1, s2, i - 1, j - 1, dp);

        return dp[i][j] = Math.min(Math.min(insert, delete), replace);

    }

    public static int tabulation(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        // base case

        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // matching does not happen
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
            }
        }

        return dp[n][m];
    }
}
