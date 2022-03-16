package cyclicsort;

public class missingpositive {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(firstMissingPositive(nums));
    }
      static int firstMissingPositive(int[] nums) {
           int i=0;
        while(i<nums.length)
      {
          int correctindex = nums[i]-1;
         if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correctindex])
           {
               swap(i,correctindex,nums);
           }
          
           else{
               i++;
           }

      }

         for( i=0; i<nums.length; i++)
        {
            if(i+1!=nums[i])
            {
                return i+1;
            }
        }
        
        return nums.length;

    }

     static void swap(int x,int y,int[] nums)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
}

