
import java.util.*;
public class kthlargest {
    public static void main(String[] args) {
        int[]arr ={3,2,1,5,6,4};
        System.out.println(findKthLargest(arr, 2));
    }
    public static  int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++)
        {
            pq.add(nums[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
            
           
        }
        return pq.peek();
    }
}
