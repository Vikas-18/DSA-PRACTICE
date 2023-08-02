import java.util.Arrays;
import java.util.PriorityQueue;

public class cpuSingleThreaded {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 4 }, { 3, 2 }, { 4, 1 } };
        System.out.println(Arrays.toString(getOrder(arr)));
    }

    public static class Pair implements Comparable<Pair> {
        int time;
        int idx;

        Pair(int time, int idx) {
            this.time = time;
            this.idx = idx;
        }

        public int compareTo(Pair o) {
            if (this.time != o.time) {
                return this.time - o.time;
            }
            return this.idx - o.idx;
        }
    }

    public static int[] getOrder(int[][] tasks) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < tasks.length; i++) {
            pq.add(new Pair(tasks[i][1], i));
        }
        int[] ans = new int[pq.size()];
        int idx = 0;
        while (pq.size() > 0) {
            ans[idx++] = pq.peek().idx;
            pq.remove(pq.peek());
        }
        return ans;
    }
}
