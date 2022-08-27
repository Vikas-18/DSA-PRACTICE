public class minSizeSubarray {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int ans = 1000000;
        int sum = 0;
        while(j<nums.length)
        {
            //calculation
            sum+=nums[j];
            
            if(sum<target)
            {
                j++;
            }
            else if(sum==target)
            {
                ans = Math.min(ans,j-i+1);
                j++;
            }
            else if(sum>target)
            {  ans = Math.min(ans,j-i+1);
               while(sum>target)
               {
                   sum-=nums[i];
                   ans = Math.min(ans,j-i+1);
                   i++;
               }
               if(sum==target)
               {
                   ans = Math.min(ans,j-i+1);
                   
               }
              
               
              
                j++;
            }
        }
        if(ans!=1000000)
        return ans;
        
        return 0;
    }
}
