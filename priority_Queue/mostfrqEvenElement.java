import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class mostfrqEvenElement {
    public static void main(String[] args) {
        int[]nums = {0,1,2,2,4,4,1};
       System.out.println(mostFrequentEven(nums));
    }
    public static class Pair
    {
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
               return  p2.frq-p1.frq;
           }
       }
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                if(map.containsKey(nums[i]))
                {
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else
                {
                    map.put(nums[i],1);
                }
            }
        }
        int ans = -1;
        PriorityQueue<Pair> pq = new PriorityQueue<>(new comparatorOfPair());
        for (Map.Entry<Integer, Integer> m : map.entrySet())
        {
               
            pq.add(new Pair(m.getKey(), m.getValue()));
               
        }
        if(pq.size()==0)
        {
            return -1;
        }
        return pq.peek().val;

    }
}
