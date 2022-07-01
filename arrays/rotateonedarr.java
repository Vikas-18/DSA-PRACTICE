package arrays;

import java.util.Arrays;

public class rotateonedarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
    static void rotate(int[] nums, int k) {
        int partition = (nums.length-1-k%nums.length);
        if(partition<0 || k==nums.length)
        {
            return;
        }
        
        int l=0;
        int r = partition;
        
        while(l<r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        
      
        l = partition + 1;
        r = nums.length-1;
         while(l<r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
              l++;
            r--;
        }
        
         l=0;
        r =nums.length-1;
         while(l<r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
              l++;
            r--;
        }
        
        
    }
}
