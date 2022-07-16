import java.util.ArrayList;
import java.util.Stack;

/**
 * max_Area_Rectangle_Binary
 */
public class max_Area_Rectangle_Binary {

    public static void main(String[] args) {
        char[][]arr = {{'0','1'}};
       int[] building = new int[arr[0].length];
        int max = -1;
        for (int j = 0; j < arr[0].length; j++) {
            building[j] = (arr[0][j]-48);//first row copied
        }
         max = mah(building);
     
        for (int i = 1; i < arr.length; i++) {
            int idx = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]-48==0)
                {
                    building[idx] = 0;
                }
                else{
                    building[idx] = building[idx] + (arr[i][j]-48);
                }
                idx++;
            }
            max = Math.max(max, mah(building));
        }
        System.out.println(max);

    }

    public static int mah(int[]heights)
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