package maths;
import java.util.*;

public class sortedarraydupli {
    public static void main(String[] args) {
        int[] nums= {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
     static int removeDuplicates(int[] nums) {
        
      Set<Integer> set = new HashSet<>();
        
        int[] arr = new int[nums.length];
        int j=0;
         int counter=1;
        for(int i=0; i<nums.length; i++)
        {
           
            if(set.contains(nums[i]))
            {
                
                counter++;
                
                if(counter<2)
                {
                    arr[j]=nums[i];
                    j++;
                }
            }
            else{

                counter=0;
                set.add(nums[i]);
                arr[j]=nums[i];
                j++;
                
            }
        }
       counter=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[0]!=0)
            {
                
            }


           
            nums[i] = arr[i];

        }
        return arr.length;
    }
}
