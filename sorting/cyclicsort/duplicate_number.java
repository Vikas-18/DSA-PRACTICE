package cyclicsort;

public class duplicate_number {
    public static void main(String[] args) {
        int[]nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }
     static int findDuplicate(int[] nums) {
        
        int i=0; 
        while(i<nums.length)
        {
            int correctindex = nums[i] - 1;
            
            if(nums[i]!=nums[correctindex])
            {
                swap(i,correctindex,nums);
            }
            
            else{
                i++;
            }
        }
        
        for(i=0; i<nums.length; i++)
        {
            if(i+1!=nums[i])
            {
                return nums[i];
            }
        }
        return -1;
    }
   static void swap(int x,int y,int[]arr)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}


