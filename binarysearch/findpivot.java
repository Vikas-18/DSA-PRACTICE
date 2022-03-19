public class findpivot {
    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(pivot(nums));
    }

     static int pivot(int[] nums) {
        
        int s = 0;
        int e = nums.length-1;
        if(nums.length==1)
        {
            return 0;
        }
        while(s<e)
        {
            int mid = s+(e-s)/2;
            
            if(mid<=e && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            
            else if(mid>=s && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            
            else if(nums[s]>nums[mid])
            {
                e = mid - 1;
            }
            else if(nums[s]>nums[mid])
            {
                s = mid+1;
            }
        }
        
        return -1;
        
    }
}
