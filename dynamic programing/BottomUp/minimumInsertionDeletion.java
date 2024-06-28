package BottomUp;

public class minimumInsertionDeletion {
    public static void main(String[] args) {
        // from a to b string how many minimum number of chars need to be deleted or
        // added
        String s = "heap";
        String t = "pea";

        // heap -> ea -> pea
        int lcs = solve(s, t);

        int deletions = s.length() - lcs;
        int insertions = t.length() - lcs;
        System.out.println(deletions + insertions);
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
