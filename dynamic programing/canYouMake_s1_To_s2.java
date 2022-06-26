public class canYouMake_s1_To_s2 {
    public static void main(String[] args) {
        //only deletions ans insertions are allowed
        String s1 = "abs";
        String s2 = "ab";
        int ans = solve2(s1, s2);
        int ans1 = s1.length()-ans;
        int ans2 = s2.length()-ans;
        int res =  ans1+ans2;
        System.out.println(res);
    }
    // we can always make s1 to s2 by deleting all the char and inserting only s2 char intuition behind this approach is that keeping longest common subsequence and just getting ans for char which need to be deleted and then inserted,so that both the strings are equal 
    public static int solve2(String s1,String s2)
    {
        int n=s1.length();
    int m=s2.length();

    int dp[][]=new int[n+1][m+1];
    for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dp[i][j] = -1;
            }
        }
    
    
    for(int i=0;i<=n;i++){
        dp[i][0] = 0;
    }
    for(int i=0;i<=m;i++){
        dp[0][i] = 0;
    }
    
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
            else
                dp[ind1][ind2] = 0 + Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
        }
    }
    
    return dp[n][m];
    }

}

