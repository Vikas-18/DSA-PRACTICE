import java.util.Collections;
import java.util.PriorityQueue;

public class minimumStones {
    public static void main(String[] args) {
        int[] piles = {5,4,9};
        double a = Math.floor(9.0/2.0);
        System.out.println(a);
        System.out.println(minStoneSum(piles, 2));
    }
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<piles.length; i++)
        {
            pq.add(piles[i]);
        }
        int i=0;
        while(i<k)
        {
            int insert = pq.poll();
            pq.add(insert-insert/2);
            i++;
        }
        int ans=0;
        while(pq.size()>0)
        {
            ans+=pq.peek();
            pq.remove(pq.peek());
        }
        return ans;
    }
}
