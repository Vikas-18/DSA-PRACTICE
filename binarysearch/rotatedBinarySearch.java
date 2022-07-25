public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[]nums ={4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {
        int pivot = findMin(nums);
        int ans1 = binarysearch(nums,target,0,pivot-1);
        int ans2 = binarysearch(nums,target,pivot,nums.length-1);
        
        if(ans1==-1)
        {
            return ans2;
        }
        return ans1;
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
                return mid;
            }
            
            else if(nums[mid] >= nums[0]) 
                s = mid+1;
            else 
                e = mid-1;
        }
        
        return 0;
    }
    
    public static int binarysearch(int[]nums,int target,int s,int e)
    {
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(nums[mid]==target)
            {
              return mid;
            }
            
            else if(nums[mid]>target)
            {
                e = mid-1;
            }
            
            else
            {
               s = mid+1;
            } 
        }
        return -1;
    }
}
