public class countnumberofoccurences {
    public static void main(String[] args) {
        int[]nums = {1,1,3,3,3,4,5,6,7,8};
        int target = 3;
        int first = firstoccurence(nums, target);
        int last = lastoccurence(nums, target);
        int ans = last-first+1;
        System.out.println(ans);
    }

    public static int firstoccurence(int[]nums,int target)
    {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(nums[mid]==target)
            {
                ans = mid;
                e = mid-1;
            }
            
            else if(nums[mid]>target)
            {
                e = mid-1;
            }
            
            else {
                s = mid+1;
            }
        }
        
        return ans;
    }
    
     public static int lastoccurence(int[]nums,int target)
    {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(nums[mid]==target)
            {
                ans = mid;
                 s = mid+1;
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
         return ans;
    }
}
