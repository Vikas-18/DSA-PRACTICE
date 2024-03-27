import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class insertinterval {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            list.add(new Pair(intervals[i][0], intervals[i][1]));
        }
        list.add(new Pair(newInterval[0], newInterval[1]));
        Collections.sort(list);

        ArrayList<Pair> ans = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (ans.isEmpty() || ans.get(ans.size() - 1).s < list.get(i).f) {
                ans.add(new Pair(list.get(i).f, list.get(i).s));
            } else {
                ans.set(ans.size() - 1, (new Pair(Math.min(ans.get(ans.size() - 1).f, list.get(i).f),
                        Math.max(ans.get(ans.size() - 1).s, list.get(i).s))));
            }
        }

        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).f;
            res[i][1] = ans.get(i).s;
        }
        return res;
    }

    public static class Pair implements Comparable<Pair> {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }

        public int compareTo(Pair o) {
            return this.f - o.f;
        }
    }
}
