import java.util.*;
public class sortcharcterbyfrq {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static class Pair implements Comparable<Pair>{
        char ch;
        int frq;
        Pair(char ch,int frq)
        {
            this.ch = ch;
            this.frq = frq;
        }
        
        public int compareTo(Pair o)
        {
            return o.frq-this.frq;
        }
    }
    public static String frequencySort(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            
            if(map.containsKey(s.charAt(i)))
            {
                int oldfrq = map.get(s.charAt(i));
                int newfrq = oldfrq + 1;
                map.put(s.charAt(i),newfrq);
            }
            else
            map.put(s.charAt(i),1);
        }
        String ans = "";
    PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getKey()=='a')
            pq.add(new Pair(m.getKey(), m.getValue()));
            
        }
        
        while(pq.size()>0)
        {
            while(pq.peek().frq>0)
            {
                ans += pq.peek().ch;
                pq.peek().frq = pq.peek().frq-1;
            }
            pq.remove();
        }
        return ans;
        
    }
}
