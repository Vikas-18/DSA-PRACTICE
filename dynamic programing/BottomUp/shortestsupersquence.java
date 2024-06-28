package BottomUp;

public class shortestsupersquence {
    public static void main(String[] args) {
        String s = "acbefkh";
        String t = "abseafefsffh";
        // super squennce refers to the squence where each string is present in worst
        // case the length will be s+t in ideal there will be some common chars which we
        // can only use once to satisfy both the strings
        System.out.println(s.length() + t.length() - solve(s, t));
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
