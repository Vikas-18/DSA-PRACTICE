import java.util.Arrays;
import java.util.Stack;

/**
 * largestarearectangle
 */
public class largestarearectangle {

    public static void main(String[] args) {
        int[] heights  ={2,1,5,6,2,3};
        System.out.println(solve(heights));
      
        
    }
    public static int[] nearestsmallerright(int[] heights) {
        //next smaller element on right
        
        Stack<Integer> st = new Stack<>();
        int[]nsl = new int[heights.length];
        int idx = heights.length-1;
        for(int i=heights.length-1; i>=0; i--)
        {
            if(st.size()==0)
            {
               nsl[idx] =nsl.length;
            }
            
            else{
                if(st.size()!=0 && heights[st.peek()]<heights[i])
                {
                  nsl[idx] = st.peek();
                }
                else if(heights[st.peek()]>=heights[i])
                {
                    while(st.size()!=0 && heights[st.peek()]>=heights[i])
                    {
                        st.remove(st.peek());
                    }
                    if(st.size()==0)
                    {
                       nsl[idx] =nsl.length;
                    }
                    else{
                       nsl[idx] = st.peek();
                    }
                }
            }
            idx--;
            st.add(i);
        }
       return nsl;
        
    }

    public static int[] nearestsmallerleft(int[] heights) {
        //next smaller element on right
        
        Stack<Integer> st = new Stack<>();
        int[]nsr = new int[heights.length];
        int idx = 0;
        for(int i=0; i<heights.length; i++)
        {
            if(st.size()==0)
            {
               nsr[idx] =heights.length;
            }
            
            else{
                if(st.size()!=0 && heights[st.peek()]<heights[i])
                {
                  nsr[idx] = st.peek();
                }
                else if(heights[st.peek()]>=heights[i])
                {
                    while(st.size()!=0 && heights[st.peek()]>=heights[i])
                    {
                        st.remove(st.peek());
                    }
                    if(st.size()==0)
                    {
                       nsr[idx] =heights.length;
                    }
                    else{
                       nsr[idx] = st.peek();
                    }
                }
            }
            idx--;
            st.add(i);
        }
       return nsr;
        
    }

    public static int solve(int[]heights)
    {
        int[]nsr = new int[heights.length];
        int[]nsl = new int[heights.length];
        Stack<Integer> st = new Stack<>();
       
        int idx = heights.length-1;
        for(int i=heights.length-1; i>=0; i--)
        {//2 1 5 6 2 3
            if(st.size()==0)
            {
               nsr[idx] =heights.length;
            }
            
            else{
                if(st.size()!=0 && heights[st.peek()]<heights[i])
                {
                  nsr[idx] = st.peek();
                }
                else if(heights[st.peek()]>=heights[i])
                {
                    while(st.size()!=0 && heights[st.peek()]>=heights[i])
                    {
                        st.remove(st.peek());
                    }
                    if(st.size()==0)
                    {
                       nsr[idx] =heights.length;
                    }
                    else{
                       nsr[idx] = st.peek();
                    }
                }
            }
            idx--;
            st.add(i);
        }
        idx = 0;
        st.clear();
        for(int i=0; i<heights.length; i++)
        {
            if(st.size()==0)
            {
               nsl[idx] =-1;
            }
            
            else{
                if(st.size()!=0 && heights[st.peek()]<heights[i])
                {
                  nsl[idx] = st.peek();
                }
                else if(heights[st.peek()]>=heights[i])
                {
                    while(st.size()!=0 && heights[st.peek()]>=heights[i])
                    {
                        st.remove(st.peek());
                    }
                    if(st.size()==0)
                    {
                       nsl[idx] =-1;
                    }
                    else{
                       nsl[idx] = st.peek();
                    }
                }
            }
            idx++;
            st.add(i);
        }
        int area = 0;
        int ans =0;
        for (int index = 0; index < heights.length; index++) {
            area = ((nsr[index]-nsl[index])-1)*heights[index];
            ans = Math.max(area, ans);
        }
        return ans;
    }
}