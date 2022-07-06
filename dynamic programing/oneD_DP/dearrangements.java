package oneD_DP;
public class dearrangements {
    public static void main(String[] args) {
        int[] dp = new int[10];
        for (int i = 0; i < dp.length; i++)
        {
            dp[i] = -1;
        }
        System.out.println(solve(8,dp));

    }

    static int solve(int n,int[] dp)
    {
        //base cases
        if(n==1)
        {
            return 0;
        }

        if(n==2)
        {
            return 1;
        }

        if(dp[n]!=-1)
        {
            return dp[n];
        }


        dp[n] = (n-1)*(solve(n-1,dp)+solve(n-2,dp));

        return dp[n];
    }
}
