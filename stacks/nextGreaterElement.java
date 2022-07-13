
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        //whenever j depends upon i in O(n*n) solution then, first solution should came in your mind should be of stakc approach
        int[]arr = {7,8,1,4};
        Stack<Integer> st = new Stack<>();
        int[]ans = new int[arr.length];
        int idx=arr.length-1;
        for (int i = arr.length-1; i>=0; i--) {
            
            if(st.size()==0)
            {
                ans[idx] = -1;
            }
            else{
                if(st.peek()>arr[i])
                {
                    ans[idx] = st.peek();
                }
                else{
                    while(st.size()!=0 && st.peek()<arr[i])
                    {
                        st.remove(st.peek());
                    }
                    if(st.size()!=0)
                    ans[idx] = st.peek();
                    else
                    ans[idx] = -1;
                }
            }
            idx--;
            st.add(arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
