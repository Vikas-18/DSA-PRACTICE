public class subarraysumk {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(subarraySum(nums, 0));
    }
    public static int subarraySum(int[] nums, int k) {
        int ans=0;
        int i=0;
        int j=0;
        int sum = 0;
        while(j<nums.length)
        {
            sum+=nums[j];
            if(sum<k)
            {
                j++;
            }
            else if(sum==k)
            {
                ans++;
                j++;
            }
            else
            {
                while(sum>k)
                {
                    if(nums[i]<0)
                    {
                        sum+=nums[i];
                    }
                    else if(nums[i]>0)
                    {
                        sum-=nums[i];
                    }
                }
               if(sum==k)
               {
                 ans++;
               }
               i++;
               j++;
            }
        }
        return ans;
     }
}
