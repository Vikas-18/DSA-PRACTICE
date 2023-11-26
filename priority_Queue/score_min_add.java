
import java.util.PriorityQueue;

/**
 * score_min_add
 */
public class score_min_add {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 5, 2 };
        System.out.println(findScore(arr));
    }

    public static long findScore(int[] nums) {

        int n = nums.length;
        boolean[] marked = new boolean[n];
        long score = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(new Pair(nums[i], i));
        }

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int val = current.f;
            int idx = current.s;

            if (!marked[idx]) {
                score += val;
                marked[idx] = true;

                if (idx - 1 >= 0 && !marked[idx - 1]) {
                    marked[idx - 1] = true;
                    pq.add(new Pair(nums[idx - 1], idx - 1));
                }

                if (idx + 1 < n && !marked[idx + 1]) {
                    marked[idx + 1] = true;
                    pq.add(new Pair(nums[idx + 1], idx + 1));
                }
            }
        }

        return score;
    }

    public static class Pair implements Comparable<Pair> {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

        public int compareTo(Pair o) {
            if (o.f == this.f) {
                return this.s - o.s;
            }
            return this.f - o.f;
        }
    }
}