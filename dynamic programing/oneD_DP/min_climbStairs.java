package oneD_DP;
public class min_climbStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
            for(int i=0; i<dp.length; i++)
            {
                dp[i] = -1;
            }
        // int ans = Math.min(solve(cost,cost.length-1,dp),solve(cost,cost.length-2,dp));
        // return ans;
        return solve2(cost,dp);
        
    }
    
    public static int solve(int[] cost,int n,int[] dp)
    {
        if(n==1|| n==0)
        {
            return cost[n];
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n] = cost[n] + Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        
        return dp[n];
    }
    
    public static int solve2(int[] cost,int[] dp)
    {
        //tabulation
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        
        for(int i=2; i<cost.length; i++)
        {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}

