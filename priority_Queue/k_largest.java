import java.util.PriorityQueue;

public class k_largest {
    public static void main(String[] args) {
        int[]arr = {3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        while (pq.size()>0) {
            System.out.println(pq.remove());
        }
    }
}
