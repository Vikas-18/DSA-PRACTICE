package cyclicsort;

public class missing_number {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    
     static int missingNumber(int[] nums) {
      int i=0;
    
      while(i<nums.length)
      {
          int correctindex = nums[i];
         if(nums[i]<nums.length &&(nums[i]!=nums[correctindex]))
           {
               swap(i,correctindex,nums);
           }
           else{
               i++;
           }
      }
        
        for( i=0; i<nums.length; i++)
        {
            if(i!=nums[i])
            {
                return i;
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
