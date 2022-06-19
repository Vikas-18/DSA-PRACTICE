public class house_robbers_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] dp1 = new int[nums.length];
        for (int i = 0; i < dp1.length; i++) {
            dp1[i] = -1;
        }
        int[] dp2 = new int[nums.length];
        for (int i = 0; i < dp2.length; i++) {
            dp2[i] = -1;
        }
        int[] arr1 = new int[nums.length-1];
        int[] arr2 = new int[nums.length-1];
        
        for(int i=0; i<nums.length-1; i++)
        {
            arr1[i] = nums[i];
        }
        
        for(int i=1; i<nums.length; i++)
        {
            arr2[i-1] = nums[i];
        }
      
       int ans1  = solve(arr1,0,0,0,dp1);

       int ans2 = solve(arr2,0,0,0,dp2);

       System.out.println(ans1);
       System.out.println(ans2);
        
      
    }

  
    public static int solve(int[] nums,int idx,int sum,int maxsum,int[]dp)
    {
        //base case
        if(idx>=nums.length)
        {
            maxsum = Math.max(sum, maxsum);
            return maxsum;
        }

        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        //pick
        sum+=nums[idx];
        int ans1 =  solve(nums,idx+2,sum,maxsum,dp);
        sum-=nums[idx];
            //not pick
        int ans2 = solve(nums,idx+1,sum,maxsum,dp);
        dp[idx] = Math.max(ans1,ans2);
        return dp[idx];
    }
}
