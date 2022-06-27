
public class combination_nCr {
    public static void main(String[] args) {
        
        int[][] dp = new int[6][3];

      for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
            dp[i][j]=-1;
        }
      }
      System.out.println(solve(5,2,dp));
     
    }

    static int solve(int n,int r,int[][]dp)
    {
        if(n==r || r==0)
        {
            
            return 1;
        }

        if(dp[n][r]!=-1)
        {
            return dp[n][r];
        }

        int ans =  solve(n-1, r-1,dp) + solve(n-1, r,dp);
        return dp[n][r] =  ans;
    }
}
