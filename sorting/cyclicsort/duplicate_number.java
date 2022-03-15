package cyclicsort;

public class duplicate_number {
     public int findDuplicate(int[] nums) {
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
                 if(i==nums.length)
            {
                return nums[i-1];
            }
           }
      }
        return -1;
    }
     public void swap(int x,int y,int[] nums)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}


