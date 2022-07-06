package twoD_DP;
public class knapsack_zero_one {
    public static void main(String[] args) {
        int[] wt= {1,2,4,5};
        int[] val = {5,4,8,6};
        int capacity = 5;
        int[][] dp = new int[5][9];
        for (int i = 0; i < dp.length; i++) {
           for (int j = 0; j < dp[0].length; j++) {
              dp[i][j] =-1;
           }
        }
        System.out.println(solve(wt, val, 2, capacity,dp));
    }
    //top down approach
    static int solve(int[] wt,int[] val,int idx,int capacity,int[][] dp)
    {
        //base case always think for a single element
        if(idx==0)
        {
            if(wt[0]<=capacity)
            return val[0];
            else
            return 0;
        }

        if(dp[idx][capacity]!=-1)
        {
            return dp[idx][capacity];
        }
        // not taking

        int notpick = 0 + solve(wt, val, idx-1, capacity,dp);

        //taking
        int pick = Integer.MIN_VALUE;
        if(wt[idx]<=capacity)
        pick = val[idx] + solve(wt, val, idx, capacity-wt[idx],dp);

        
        return  dp[idx][capacity] = Math.max(pick,notpick);

        

    }
}
