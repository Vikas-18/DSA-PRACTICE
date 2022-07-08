
import java.util.*;

public class arrfrqsort {
    public static void main(String[] args) {
        int[]nums = {1,1,1,3,2,4,4};
        System.out.println(Arrays.toString(frequencySort(nums)));
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
                   return p2.val-p1.val;
               }
               return  p1.frq-p2.frq;
           }
       }
       
       public static int[] frequencySort(int[] nums) {
       
            HashMap<Integer,Integer> map = new HashMap<>();//simply creating map for storing arr[i] and their frquency's
           
           for(int i=0; i<nums.length; i++)
           {
               
               if(map.containsKey(nums[i]))
               {
                   int oldfrq = map.get(nums[i]);
                   int newfrq = oldfrq + 1;
                   map.put(nums[i],newfrq);
               }
               else
               map.put(nums[i],1);
           }
       PriorityQueue<Pair> pq = new PriorityQueue<>(new comparatorOfPair());// min heap because we want lowest frequency elements at the top
            
           for (Map.Entry<Integer, Integer> m : map.entrySet()) {//adding values in pq
               
               pq.add(new Pair(m.getKey(), m.getValue()));
               
           }
           int[] ans = new int[nums.length];
           int idx = 0;
           while(pq.size()>0)//removing from heap till it is empty
           {
               while(pq.peek().frq>0)//this check is for checking that, that all the occurences should be added in the ans
               {
                   ans[idx] = pq.peek().val;
                   pq.peek().frq = pq.peek().frq-1;
                   idx++;
               }
               pq.remove();//after taking all the occurences of a particular element removing it from heap
           }
           return ans;
       }
}
