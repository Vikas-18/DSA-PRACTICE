public class binarysubarray {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(nums, 2));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int i=0;
        int j=0;
        int sum = 0;
        int cnt = 0;
        while(j<nums.length)
        {
            sum+=nums[j];
            if(sum<goal)
            {
                j++;
            }
            
            else if(sum==goal)
            {
                cnt++;
                j++;
            }
            
            else
            {
                 while(sum>=goal)
                 {
                    sum-=nums[i];
                    i++;
                    if(sum==goal)
                    {
                        cnt++;
                    }
                 }
                j++;
            }
        }
        return cnt;
    }
}

