import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;

public class leetcodeContest {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 2, 1 }, freq = { 3, 2, -3, 1 };
        System.out.println(mostFrequentIDs(nums, freq));
    }

    public static long[] mostFrequentIDs(int[] nums, int[] freq) {
        long[] ans = new long[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Pair p = new Pair(nums[i], map.get(nums[i]));
                pq.remove(p);
                map.put(nums[i], map.get(nums[i]) + freq[i]);
                Pair np = new Pair(nums[i], map.get(nums[i]));
                pq.add(np);
            } else {
                map.put(nums[i], freq[i]);
                Pair np = new Pair(nums[i], map.get(nums[i]));
                pq.add(np);
            }

            ans[i] = pq.peek().s;
        }

        return ans;
    }

    public static class Pair implements Comparable<Pair> {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

        public int compareTo(Pair o) {
            return o.s - this.s;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Pair pair = (Pair) obj;
            return f == pair.f && s == pair.s;
        }

        @Override
        public int hashCode() {
            return Objects.hash(f, s);
        }
    }
}
