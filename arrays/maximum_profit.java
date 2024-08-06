
/**
 * maximum_profit
 */
import java.util.ArrayList;

public class maximum_profit {

    public static void main(String[] args) {
        int[] startTime = { 1, 1, 1 }, endTime = { 2, 3, 4 }, profit = { 5, 6, 4 };
        System.out.println(jobScheduling(startTime, endTime, profit));
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        ArrayList<Triplet> list = new ArrayList<>();

        for (int i = 0; i < startTime.length; i++) {
            list.add(new Triplet(startTime[i], endTime[i], profit[i]));
        }

        return solve(list, 0, -1);
    }

    public static int solve(ArrayList<Triplet> list, int idx, int prevet) {
        if (idx == list.size()) {
            return 0;
        }

        int pick = 0;
        if (list.get(idx).f >= prevet) {
            pick = list.get(idx).t + solve(list, idx + 1, list.get(idx).s);
        }

        int notpick = solve(list, idx + 1, prevet);

        return Math.max(pick, notpick);

    }

    public static class Triplet {
        int f;
        int s;
        int t;

        public Triplet(int f, int s, int t) {
            this.f = f;
            this.s = s;
            this.t = t;
        }
    }
}