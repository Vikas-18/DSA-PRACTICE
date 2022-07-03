public class chooseStudents {
    public static void main(String[] args) {
      int[][]dp = new int[200][200];
      for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp.length; j++) {
          dp[i][j] = -1;
        }
      }
        System.out.println(solve(20, 13,dp));
    }
//nCr = 
    public static int solve(int n,int r,int[][]dp)
    {
       //base case
       if(n==r || r==0)
       {
        return 1;
       }

       if(dp[n][r]!=-1)
       {
        return dp[n][r];
       }
      return dp[n][r] =  solve(n-1,r,dp)+solve(n-1, r-1,dp);
    }
}
