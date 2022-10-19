import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class topKfrqWords {

    public static void main(String[] args) {
        String words[] = {"i","love","leetcode","i","love","coding"};
        int k=2;
        ArrayList<String> ans =  topKFrequent(words, k);
        System.out.println(ans);

    }
    public static class Pair
    {
        String key;
        int val;
        Pair(String key,int val)
        {
           this.key = key;
           this.val = val; 
        }
    }
    public static class comparatorofPair implements Comparator<Pair>
        {
            public int compare(Pair p1,Pair p2)
            {
              
                 if(p1.val==p2.val)
                {
                   if(p1.key.compareTo(p2.key)>0)
                   {
                     return 1;
                   }
                   return -1;
                }
                
                return p2.val  - p1.val;
            }
        }
    public static ArrayList<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
            {
                map.put(words[i],map.get(words[i])+1);
            }
            else
            {
                map.put(words[i],1);
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        PriorityQueue<Pair> q = new PriorityQueue<>(new comparatorofPair());
         for (Entry<String, Integer> m : map.entrySet()) {
            
            q.add(new Pair(m.getKey(), m.getValue()));
            
        }
        
        for(int i=0; i<k; i++)
        {
            ans.add(q.peek().key);
            q.remove();
        }  
         
        return ans;
    }
}
