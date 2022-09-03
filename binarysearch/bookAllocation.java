public class bookAllocation {
    public static void main(String[] args) {
        int[]nums = {3,2,15,5};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

   
    public static int splitArray(int[] nums, int m) {
        int s=0;
        int e = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            s = Math.max(s,nums[i]);
            e+=nums[i];
        }
        
        while(s<e)
        {
            int mid = s + (e-s)/2;
            
            int sum=0;
            int pieces = 1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            
            if(pieces<=m)
            {
                e = mid;
            }
            else{
                s = mid+1;
            }
        }
        return e;
    }
    
}
