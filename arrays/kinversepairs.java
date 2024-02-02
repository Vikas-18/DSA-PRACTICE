/**
 * kinversepairs
 */
public class kinversepairs {

    public static void main(String[] args) {
        System.out.println(kInversePairs(3, 1));
    }

    public static int kInversePairs(int n, int k) {
        return solve(n, k, 0, -1);
    }

    public static int solve(int n, int k, int idx, int prev) {
        if (k == 0) {
            return 1;
        }
        if (idx > n) {

            return 0;
        }

        int pick = 0;
        int notpick = 0;
        for (int i = 1; i <= n; i++) {
            if (prev == -1 || idx == 0) {
                pick = solve(n, k, idx + 1, i);
            } else if (prev != -1 && prev > i) {
                pick = solve(n, k - 1, idx + 1, i);
            } else {
                notpick = solve(n, k, idx + 1, prev);
            }
        }
        return notpick + pick;
    }
}