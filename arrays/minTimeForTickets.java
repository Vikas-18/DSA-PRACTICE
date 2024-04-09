import java.util.ArrayDeque;
import java.util.Deque;

public class minTimeForTickets {
    public static void main(String[] args) {
        int[] tickets = { 5, 1, 1, 1 };
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Pair> dq = new ArrayDeque<>();
        int ans = 0;
        for (int i = 0; i < tickets.length; i++) {
            dq.addLast(new Pair(tickets[i], i));
        }

        while (tickets[k] > 0) {
            int num = dq.getFirst().f;
            int idx = dq.getFirst().s;

            tickets[idx]--;
            if (num > 0)
                ans++;
            dq.removeFirst();
            dq.addLast(new Pair(num - 1, idx));
        }
        return ans;

    }

    public static class Pair {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }
}
