package arrays;
import java.util.*;
public class longestCommon_subsequence {
    public static void main(String[] args) {
        int[] nums = {2,5,1,6,8,4,9,7};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map  = new HashMap<>();
        
        for(int val:nums)
        {
          map.put(val,true);
        }
        
        for(int val: nums)
        {
            if(map.containsKey(val-1))
            {
                map.put(val,false);
            }
        }
        int ans = 0;
        for(int val:nums)
        {
            int startpoint = val;
            int length = 1;
            if(map.get(val)==true)
            {
            while(map.containsKey(startpoint+length))
            {
                length++;
            }
            if(ans<length)
            {
               ans = length;
            }
            }
        }
        return ans;
    }

}
