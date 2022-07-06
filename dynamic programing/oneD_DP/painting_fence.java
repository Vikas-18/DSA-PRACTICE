package oneD_DP;
public class painting_fence {
    public static void main(String[] args) {
        int[] dp = new int[10];
        for (int i = 0; i < dp.length; i++)
        {
            dp[i] = -1;
        }
        System.out.println(solve(3,2,dp));

    }
    static int solve(int n,int k,int[] dp)
    {
        //base cases
        if(n==1)
        {
            return k;
        }

        if(n==2)
        {
            return k+k*(k-1);
        }

        if(dp[n]!=-1)
        {
            return dp[n];
        }


        dp[n] = (k-1)*(solve(n-1,k,dp)+solve(n-2,k,dp));

        return dp[n];
    }
}
