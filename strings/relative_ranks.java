import java.util.Arrays;
import java.util.PriorityQueue;

public class relative_ranks {
    public static void main(String[] args) {
        int[]arr = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }
    public static class Pair implements Comparable<Pair>
    { int val;
      int pos;
     
      Pair(int val,int pos)
      {
          this.val= val;
          this.pos = pos;
      }
        public int compareTo(Pair o)
        {
            return o.val-this.val;
        }
    }
    public static  String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0; i<score.length; i++)
        {
            pq.add(new Pair(score[i],i+1));
        }
        
        String[]ans = new String[score.length];
        int idx = 0;
        int counter=0;
        while(pq.size()>0)
        { 
            if(counter==0)
           ans[pq.peek().pos-1] = "Gold Medal";

           else if(counter==1)
           ans[pq.peek().pos-1] = "Silver Medal";
            
           else if(counter==2)
           ans[pq.peek().pos-1] = "Bronze Medal";
            
           else 
           ans[pq.peek().pos-1] = String.valueOf(counter+1);

           pq.remove();
           counter++;
        }
        return ans;
    }
}
