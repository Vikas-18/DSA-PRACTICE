import java.util.PriorityQueue;

public class minimum_diffidx {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(minimumAverageDifference(nums));

    }
    public static class Pair implements Comparable<Pair> 
    {
        int idx;
        int diff;
        Pair(int idx,int diff)
        {
            this.idx = idx;
            this.diff  = diff;
        }

        public int compareTo(Pair o)
        {
            if(o.diff==this.diff)
            {
                return this.idx-o.idx;
            }
            return this.diff-o.diff;
        }
    }
    public static int minimumAverageDifference(int[] nums) {
        int sum = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
        }



        int temp = 0;
        for(int i=0; i<nums.length; i++)
        {
            temp+=nums[i];
            int k = (temp)/(1+i);
            int l=0;
            if(i!=nums.length-1)
            l = (sum-temp)/(nums.length-i-1);
            if(i==nums.length-1)
            {
                l = (sum-temp)/(nums.length-i);
            }
            int diff =Math.abs(k-l);
            Pair p = new Pair(i,diff);
            pq.add(p);
        }
        return pq.peek().idx;
    }
}
