package twoD_DP;
public class tribonacci {
    public static void main(String[] args) {
        int n= 25;
        int[] dp = new int[n+1];
        System.out.println(solve(n, dp));
    }
        public static int solve(int n , int[]dp)
        {
          if(n==0 || n==1)
         {
            return n;
         }
          if(n==2)
         {
            return 1;
         }
            if(dp[n]!=0)
            {
                return dp[n];
            }
            dp[n] = solve(n-1,dp) + solve(n-2,dp) + solve(n-3,dp);
            return  solve(n-1,dp) + solve(n-2,dp) + solve(n-3,dp);
        }
        
}

