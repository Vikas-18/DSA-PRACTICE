package twoD_DP;

import java.util.ArrayList;

public class largestSubset {
    public static void main(String[] args) {
        int[]nums = {1,4,7,8,16};
        int[][]dp= new int[nums.length+1][nums.length+1];
        for (int i = 0; i < dp.length; i++) {
            
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(solve(nums, 0, -1, dp));
        for (int i = 0; i < dp.length; i++) {
            for (int j =0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                 if(i==j && dp[i][j]>=0)
                 {
                    ans.add(nums[dp[i][j]]);
                 }
            }
        }
        System.out.println(ans);
    }
    public static int solve(int[]nums,int idx,int prev,int[][]dp)
    {
        if(idx==nums.length)
        {
            return 0;
        }
        if(dp[idx][prev+1]!=-1)
        {
            return dp[idx][prev+1];
        }

        //not take
        int nottake = solve(nums,idx+1,prev,dp);

        int take = 0;
        if(prev==-1 || nums[idx]%nums[prev]==0 || nums[prev]%nums[idx]==0)
        {
       
            take = 1 + solve(nums,idx+1,idx,dp);
        }

        return dp[idx][prev+1] =  Math.max(take,nottake);

    }
}
