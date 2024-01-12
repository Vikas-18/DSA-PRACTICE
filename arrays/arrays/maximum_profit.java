package arrays;

import java.util.ArrayList;

public class maximum_profit {

    public static void main(String[] args) {
        int[] startTime = { 1, 2, 3, 3 }, endTime = { 3, 4, 5, 6 }, profit = { 50, 10, 40, 70 };
        System.out.println(jobScheduling(startTime, endTime, profit));
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int ans = 0;

        ArrayList<Triplet> list = new ArrayList<>();

        for (int i = 0; i < startTime.length; i++) {
            list.add(new Triplet(startTime[i], endTime[i], profit[i]));
        }

        for (int i = 0; i < profit.length; i++) {
            int ist = list.get(i).f;
            int iet = list.get(i).s;
            int ip = list.get(i).t;
            int tempprofit = ip;
            for (int j = i + 1; j < profit.length; j++) {
                int st = list.get(j).f;
                int et = list.get(j).s;
                int p = list.get(j).t;

                if (ist >= et) {
                    tempprofit += p;
                }
            }
            ans = Math.max(tempprofit, ans);
        }
        return ans;
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
