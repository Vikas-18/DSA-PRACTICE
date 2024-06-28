package BottomUp;

public class palindromicSubsequence {
    public static void main(String[] args) {
        String s = "asadracecar";
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i) + t;
        }
        System.out.println(solve(s, t));
    }

    public static int solve(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
