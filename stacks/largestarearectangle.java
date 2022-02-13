/**
 * largestarearectangle
 */
public class largestarearectangle {

    public static void main(String[] args) {
        int[] heights  ={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
     static int largestRectangleArea(int[] heights) {
        
        int maxarea = 0;
        for(int i=0; i<heights.length; i++)
        {
            int right=i;
            int left=i;
            int area = 1;
            while(right<heights.length-1 && heights[right]<heights[right+1])
            {
                right=right+1;
                
            }
            right++;
            while(left>0 && heights[left]<heights[left-1])
            {
                left--;
                
            }
            left=left+1;
             int width = (right-left)+1;
        int length = heights[i];
            area = width*length;
            if(maxarea<area)
            {
                maxarea=area;
            }
            
        }
        return maxarea;
       
    }
}