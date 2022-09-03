public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,2,5};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=0;
         
         while(j<nums.length)
         {
            if(Math.abs(i-j)<=k)
            {
                if(i!=j && nums[i]==nums[j])
                {
                    return true;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                while(Math.abs(i-j)>k)
                {
                    i++;
                    if(i!=j && nums[i]==nums[j])
                    {
                        return true;
                    }

                }
                j++;
            }
         }
         return false;
     }
}
