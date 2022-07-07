import java.util.*;

public class kclosest {
   public static class Pair implements Comparable<Pair>{
        int val1;
        int val2;
        Pair(int val1,int val2)
        {
            this.val1 = val1;
            this.val2 = val2;
        }
        public int compareTo(Pair o)//helpful for comparing custom classes
        {
            return this.val1-o.val1;
        }
    }
    public static class compratorOfPair implements Comparator<Pair>
    {
        public int compare(Pair i,Pair j)
        {
            if(i.val1==j.val1)
            {
                return j.val2-i.val2;
            }
            else
            return  j.val1-i.val1;
        }
    }
    {

    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int k=4;
        int x = 3;
        PriorityQueue<Pair> pq = new PriorityQueue<>(new compratorOfPair());
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(Math.abs(x-arr[i]), arr[i]));
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        while (pq.size()>0) {
            System.out.println(pq.remove().val2);
        }


    }
   
}
