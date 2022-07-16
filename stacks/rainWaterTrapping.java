import java.util.Collections;
import java.util.PriorityQueue;
public class rainWaterTrapping {
    public static void main(String[] args) {
        
        int[]arr = {3,0,0,2,0,4};

        int[]largestonleft = largestOnLeft(arr);
        int[]largestonright = largestOnRight(arr);

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            int waterlevel = Math.min(largestonleft[i], largestonright[i])-arr[i];//concept to solve this problem.
            ans+=waterlevel;
        }
        System.out.println(ans);

    }//3 0 0 2 0 4

    public static int[] largestOnLeft(int[]arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[]ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(pq.size()==0)
            {
                ans[i] = arr[i];
            }
            else{
                if(pq.peek()<arr[i])
                {
                    ans[i] = arr[i];
                }
                else{
                    ans[i] = pq.peek();
                }
            }
            pq.add(arr[i]);
            
        }
        return ans;
    }
    public static int[] largestOnRight(int[]arr)
    {// 3 0 0 2 0 4
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[]ans = new int[arr.length];
        for (int i =arr.length-1; i>=0; i--) {
            if(pq.size()==0)
            {
                ans[i] = arr[i];
            }
            else{
                if(pq.peek()<arr[i])
                {
                    ans[i] = arr[i];
                }
                else{
                    ans[i] = pq.peek();
                }
            }
            pq.add(arr[i]);
            
        }
        return ans;
    }
}
