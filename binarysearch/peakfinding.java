
import java.util.*;
public class peakfinding {
    public static void main(String[] args) {
       int[] arr = {6,5,4,3,2,3,2};//1,2,3,1
       System.out.println(perfectPeak(arr));
    }

    static  int perfectPeak(int[] nums) {
        
        if(nums.length==1) //if there's only one element then it can't be peak element
            return 0; 
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) // if current element is greater than its next element then one peak will be on left side
                r = mid; //because current element can be peak element
            else
                l = mid + 1; // if current element is less than its next  there must exist peak element on its right side
        }
        return l; // this will be peak beacuse we are moving only when we have greater element than previous
    }
}
