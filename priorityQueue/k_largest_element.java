package priorityQueue;
import java.util.*;
public class k_largest_element {
    public static void main(String[] args) {
        int[] arr = {10,3,4,17,18,1,20};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k=3;

        for (int i = 0; i <arr.length; i++) {
            if(i<k)
            pq.add(arr[i]);
            else {
                if(arr[i]>pq.peek())
                {
                    pq.remove();
                    pq.add(arr[i]);
                }
           }
        }

       while(pq.size()>0)
       {
        System.out.println(pq.peek());
        pq.remove();
       }


    }
}
