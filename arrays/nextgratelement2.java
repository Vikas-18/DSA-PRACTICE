import java.util.Arrays;

public class nextgratelement2 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
       
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i; j<nums.length; j++)
            {
                if(nums[j]>nums[i])
                {
                    ans[i] = nums[j];
                    break;
                }
                if(j==nums.length-1 && ans[i]==0)
                {
                    j=0;
                    while(j<i)
                    {
                        if(nums[j]>nums[i])
                        {
                            ans[i] = nums[j];
                            break;
                        }
                        else
                        j++;
                    }
                }
            }
            if(ans[i]==0)
            {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
