public class findMinimumInRotatedSorted {
    //remember one thing that min element will be found in unsorted arr so try to go to unsorted side.
    public static void main(String[] args) {
        int[] nums = {4,6,7,8,9,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        if(nums[0]<=nums[nums.length-1])
            return nums[0];
        while(s<=e)
        {
            int mid = s + (e-s)/2;
     
            if(nums[mid]<=nums[(mid+nums.length-1)%nums.length])
            {
                return nums[mid];
            }
            
            else if(nums[mid] >= nums[0]) 
                s = mid+1;
            else 
                e = mid-1;
        }
        
        return 0;
    }
}
