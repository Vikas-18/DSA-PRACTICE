import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class sortbybits {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static class Pair{//pair class to store frq and key as arr[i]
        int val;
        int frq;
        Pair(int val,int frq)
        {
            this.val = val;
            this.frq = frq;
        }
     }
      public static class comparatorOfPair implements Comparator<Pair>
    {
        public int compare(Pair p1,Pair p2)
        {
            if(p1.frq==p2.frq)
            {
                return p1.val-p2.val;
            }
            return  p1.frq-p2.frq;
        }
    }
 public static int[] sortByBits(int[] arr) {
     PriorityQueue<Pair> pq = new PriorityQueue<>(new comparatorOfPair());
     for(int i=0; i<arr.length; i++)
     {
        int count = countbits(arr[i]);
        pq.add(new Pair(arr[i],count));
     }
     int[]ans = new int[pq.size()];
     int idx = 0;
     while(pq.size()>0)
     {
         ans[idx] = pq.peek().val;
         pq.remove();
         idx++;
     }
     return ans;
 }
 public static int countbits(int n)
 {
     int ans=0;
     while(n>0)
     {
         if((n&1)==1)
         {
             ans++;
         }
         n = n>>1;
     }
     return ans;
 }
}
