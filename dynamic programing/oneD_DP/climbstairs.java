package oneD_DP;
public class climbstairs {
    public static void main(String[] args) {
        int A= 5;
        int[] dp  = new int[A+1];

        System.out.println(solve(A, dp));

    }

    public static int solve(int A,int[]dp)
    {
        if(A==1 || A==2)
        {
            return A;
        }

        if(dp[A]!=0)
        {
            return dp[A];
        }

        dp[A] = solve(A-1,dp) + solve(A-2,dp);

        return solve(A-1,dp) + solve(A-2,dp);
    }
}
