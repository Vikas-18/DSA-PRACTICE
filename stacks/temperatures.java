import java.util.Arrays;
import java.util.Stack;

public class temperatures {
    public static void main(String[] args) {
        int[]temperatures = {89,62,70,58,47,47,46,76,100,70};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans  = new int[n];
        for(int i=n-1; i>=0; i--)
        {
            if(st.size()==0)
            {
                ans[i] = 0;
            }
            else
            {
                if(temperatures[st.peek()]>temperatures[i])
                {
                    ans[i] = st.peek()-i;
                }
                else
                {
                    while(st.size()>0 && temperatures[st.peek()]<=temperatures[i])
                    {
                        st.remove(st.peek());
                    }
                     if(st.size()==0)
                    {
                        ans[i] = 0;
                    }
                    else if(temperatures[st.peek()]>temperatures[i])
                    {
                       ans[i] = st.peek()-i;
                    }
                }
            }
            st.add(i);
        }
        return ans;
    }
}
