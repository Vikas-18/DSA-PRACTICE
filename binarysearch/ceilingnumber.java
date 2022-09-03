public class ceilingnumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,7,12,14,17};
        System.out.println(ceiling(arr, 13));
    }

    public static int ceiling(int[] nums , int k)
    {
        int s=0;
         int e = nums.length-1;
        
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(nums[mid]==k)
            {
                s = mid+1;
            }
            
            else if(nums[mid]>k)
            {
                e = mid-1;
            }
            
            else{
                s = mid+1;
            }
        }
        
       return s;
    }
}
