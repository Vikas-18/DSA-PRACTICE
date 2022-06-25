public class distinctSubsequence {
    public static void main(String[] args) {
        
    }
    public static int f(String s,String t)
    {
        int n =s.length();
        int m = t.length();
        
        int[][] dp = new int[n+1][m+1];
        
        //base case
        for(int i=0; i<=n; i++)
        {
            dp[i][0] = 1;
        }
        for(int j=1; j<=m; j++)
        {
            dp[0][j] = 0;
        }
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                  if(s.charAt(i-1)==t.charAt(j-1))
              {
                 dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
              }
              else
               dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][m];
    }
      public static int solve(String s,String t,int idx1,int idx2,int[][]dp)
    {
        //base case
          if(idx2<0)
        {
            return 1;
        }
        if(idx1<0)
        {
            return 0;
        }
        
        if(dp[idx1][idx2]!=-1)
        {
            return dp[idx1][idx2];
        }
        if(s.charAt(idx1)==t.charAt(idx2))
        {
            return dp[idx1][idx2] = solve(s,t,idx1-1,idx2-1,dp) + solve(s,t,idx1-1,idx2,dp);
        }
        else
            return dp[idx1][idx2] = solve(s,t,idx1-1,idx2,dp);
    }
}
