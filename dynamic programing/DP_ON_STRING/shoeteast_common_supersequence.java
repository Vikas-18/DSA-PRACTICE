package DP_ON_STRING;

public class shoeteast_common_supersequence {
    public static void main(String[] args) {
        System.out.println(shortestCommonSupersequence("bleed", "blue"));
    }
    public static String shortestCommonSupersequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[][]dp = new int[n+1][m+1];

        for(int i=0; i<=n; i++)
        {
           dp[i][0] = 0;
        }

        for(int j=0; j<=m; j++)
        {
            dp[0][j]=0;
           
        }


        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i=n;
        int j = m;
        String ans = "";
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ans = s1.charAt(i-1) + ans;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                ans = s1.charAt(i-1) + ans;
                i--;
            }
            else
            {
                ans = s2.charAt(j-1) + ans;
                j--;
            }
        }
        while(i>0)
        {
            ans = s1.charAt(i-1) + ans;
            i--;
        }
        while(j>0)
        {
            ans = s2.charAt(j-1) + ans;
            j--;
        }
        return ans;
    }
}
