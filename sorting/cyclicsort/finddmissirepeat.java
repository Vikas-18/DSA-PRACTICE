package cyclicsort;

import java.util.Arrays;

public class finddmissirepeat {
    public static void main(String[] args) {
        int[] nums = {5, 2, 5, 3, 4, 7, 1};
        System.out.println(Arrays.toString(repeatedNumber(nums)));
    }
static int[] repeatedNumber(final int[] nums) {
         int i=0;
        while(i<nums.length)
      {
          int correctindex = nums[i]-1;
         if(nums[i]!=nums[correctindex])
           {
               swap(i,correctindex,nums);
           }
          
           else{
               i++;
           }

      }
int [] ans = new int[2];
        for( i=0; i<nums.length; i++)
        {
            if(i+1!=nums[i])
            {
                ans[0]=nums[i];
                ans[1]=i+1;
            }
        }
        
        return ans;

    }

     static void swap(int x,int y,int[] nums)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
