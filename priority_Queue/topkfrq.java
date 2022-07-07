import java.util.*;

public class topkfrq {
  
    public static class Pair implements Comparable<Pair>{
        int key;
        int frq;

        Pair(int key,int frq)
        {
            this.key = key;
            this.frq = frq;
        }
    public int compareTo(Pair o)//helpful for comparing custom classes
        {
            return this.frq-o.frq;
        }
    }
    public static void main(String[] args) {
        int[]A = {1,1,1,2,3,3,4};
        int k=2;
        HashMap<Integer,Integer> map  = new HashMap<>();
        
        for(int i=0; i<A.length; i++)
         {
             if(map.containsKey(A[i]))
             {
                 int oldfrq = map.get(A[i]);
                 int newfrq = oldfrq+1;
                 map.put(A[i],newfrq);
             }
             else
             map.put(A[i],1);
         }

         PriorityQueue<Pair> pq = new PriorityQueue<>();

         for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            
            pq.add(new Pair(m.getKey(), m.getValue()));
            
            if (pq.size() > k) {
                
                pq.poll();
            }
        }
        int[]ans = new int[k];
        int i=0;
         while(pq.size()>0)
         {
            ans[i] = pq.remove().key;
            i++;
         }
         System.out.println(Arrays.toString(ans));


        

    }


}
