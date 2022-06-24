public class longestcommonsubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int[][] dp = new int[25][25];
        int ans1 = solve2(text1, text2);
        System.out.println(ans1);
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j] = -1;
            }
        }
      int ans = solve(text1,text1.length()-1,text2,text2.length()-1,dp);
      System.out.println(ans);
    }
    // recursion + memoization
    public static  int solve(String s1,int idx1, String s2,int idx2,int[][]dp)
    {
        //base case
        if(idx1<0 || idx2<0)
        {
            return 0;//no matching so LCS is 0
        }
        
        if(dp[idx1][idx2]!=-1)
        {
            return dp[idx1][idx2];
        }
        // if matching happen
        if(s1.charAt(idx1)==s2.charAt(idx2))
        {
            return dp[idx1][idx2] =  1+solve(s1,idx1-1,s2,idx2-1,dp);
        }
        // if matching does not happen then reduce idx1 and also idx2 and carry out the max of the 2 calls
        return dp[idx1][idx2] =  0+Math.max(solve(s1,idx1-1,s2,idx2,dp),solve(s1,idx1,s2,idx2-1,dp));
    }

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
