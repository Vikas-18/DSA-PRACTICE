import java.util.Arrays;
import java.util.HashMap;

public class findnumberofarrays {
    public static void main(String[] args) {
        int[][] q = { { 0, 1 }, { 1, 4 }, { 1, 1 }, { 1, 4 }, { 1, 1 } };
        System.out.println(Arrays.toString(queryResults(1, q)));
    }

    public static int[] queryResults(int limit, int[][] q) {
        int[] ans = new int[q.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < q.length; i++) {
            if (map.containsKey(q[i][0])) {
                if (map.get(q[i][0]) == q[i][1])
                    continue;
                set.put(map.get(q[i][0]), set.get(map.get(q[i][0])) - 1);
                if (set.get(map.get(q[i][0])) == 0) {
                    set.remove(map.get(q[i][0]));
                }
                if (set.containsKey(q[i][1])) {
                    set.put(q[i][1], set.get(q[i][1]) + 1);
                } else {
                    set.put(q[i][1], 1);
                }
                map.put(q[i][0], q[i][1]);
            } else {
                set.put(q[i][1], 1);
                map.put(q[i][0], q[i][1]);

            }
            ans[i] = set.size();
        }
        return ans;
    }
}
