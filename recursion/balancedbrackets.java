import java.util.*;

import javax.lang.model.util.ElementFilter;
public class balancedbrackets {
    public static void main(String[] args) {
      int[] nums = {1,1,1,2,2,3};
      System.out.println(removeDuplicates(nums));
    }
    static boolean balanced(String s)
    {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='(')
            {
                st.push(ch);
                
            }
            else{
                if(st.peek()==ch)
                {
                    st.pop();
                }
                else if(st.peek()!=ch)
                {
                    return false;
                }
            }
            if (st.size()!=0) {
                return false;
            }
        }
        return true;
    }
    static int removeDuplicates(int[] nums) {
        
        int[] arr = new int[nums.length];
      
          int counter=1;
        int j=0;
        for(int i=0; i<nums.length; i++)
        {
              
          if( i<nums.length-1 && nums[i]!=nums[i+1])
          {
              counter=1;
          }
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                counter++;
            }
            if(counter<=2)
            {
                arr[j] = nums[i];
                j++;
            }
        }
        nums=arr;
        int ans=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]!=0)
            {
                ans=i;
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        return ans+1;
        
    }
}
