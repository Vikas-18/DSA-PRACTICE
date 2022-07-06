/**
 * unboundedknapsack
 */
package twoD_DP;
public class unboundedknapsack {

    public static void main(String[] args) {
        int[] profit = {5, 11, 13};
        int[] weight = { 2, 4, 6 };
        int n = 3;
        int w = 10;
        int[][] dp = new int[n][w+1];
        for (int i = 0; i < dp.length; i++) {
           for (int j = 0; j < dp[0].length; j++) {
              dp[i][j] =-1;
           }
        }
        int ans =  solve(weight,profit,n-1,w,dp);
        System.out.println(ans);
    }

      static int solve(int[] wt,int[] val,int idx,int capacity,int[][] dp)
     {
         //base case always think for a single element
         if(idx==0)
         {
             if(wt[0]<=capacity)
             return (capacity/wt[0])*val[0];
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