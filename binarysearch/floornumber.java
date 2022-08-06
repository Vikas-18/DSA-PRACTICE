public class floornumber {
    
    public static void main(String[] args) {
        int[] arr ={2,10,5,4,8};
        System.out.println(floor(arr, 3));
    }

    public static int floor(int[] nums , int k)
    {
        int s=0;
         int e = nums.length-1;
        
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(nums[mid]==k)
            {
                return mid;
            }
            
            else if(nums[mid]>k)
            {
                e = mid-1;
            }
            
            else{
                s = mid+1;
            }
        }
        
        return e;
    }
}


