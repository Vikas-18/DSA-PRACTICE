package DP_ON_STRING;
public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        
    }

    public static int solve(int[] nums,int prev,int idx,int[][] dp)
    {
        //base case
        if(idx==nums.length)
        {
            return 0;
        }
        
        if(dp[idx][prev+1]!=-1)
        {
            return dp[idx][prev+1];
        }
        
        int length = 0+ solve(nums,prev,idx+1,dp);
    
        if(prev==-1 || nums[idx]>nums[prev])
        {
            length = Math.max(length,1 + solve(nums,idx,idx+1,dp));
        }
        
        return dp[idx][prev+1] = length;
        
        
    }
}
