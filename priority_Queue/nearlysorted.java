import java.util.Arrays;
import java.util.PriorityQueue;

public class nearlysorted {
    public static void main(String[] args) {
        int[]arr = {6,5,3,2,8,10,9};
        int k=3;
        int[]ans = new int[arr.length];
        int j=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();//act as a funnel which gives us the minimum element in k reigon
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
               ans[j] = pq.remove();
               j++;
            }
        }
        while(pq.size()>0)
        {
            ans[j] = pq.remove();
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
