public class min_size_subarray {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));
        
    }

    public static int minSubArrayLen(int k, int[] nums) {
        
        int i=0;
        int j=0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        
        while(j<nums.length)
        {
            sum+=nums[j];
            
            if(sum<k)
            {
              j++;
            }
            
            else if(sum==k)
            {              
                ans = Math.min(ans,j-i+1);
                j++;
            }
            
            else if(sum>k)
            {
              while(sum>k)
              {
                sum-=nums[i];
                  i++;
              }
              if(sum==k)
              ans = Math.min(ans,j-i+1);
              j++;
            }
        }
        return ans;
        
    }
}
