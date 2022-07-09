import java.util.Arrays;
import java.util.PriorityQueue;

public class slidingWindowMax {
    //simple sliding window and max heap wont work since overall complxity will be O(n*n(logn)) so storing it in Pair 
    public static void main(String[] args) {
        int[]arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }
    public static class Pair implements Comparable<Pair>{
        int index;
        int val;
        Pair(int index,int val)
        {
            this.index = index;
            this.val = val;
        }
        
        public int compareTo(Pair o){
            return o.val-this.val;
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[]ans = new int[nums.length-k+1];
        int idx = 0;
        int i=0;
        int j=0;
        
        while(j<nums.length)
        {
            pq.add(new Pair(j,nums[j]));
            
            if(j-i+1<k)
            {
                j++;
            }
            
            else if(j-i+1==k)
            {
                while(pq.peek().index<i)
                {
                    pq.remove();
                }
                ans[idx] = pq.peek().val;
                idx++;
                i++;
                j++;
            }
        }
        return ans;
    }
}
