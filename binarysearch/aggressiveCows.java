import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {

    }

    public static int aggressivecows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int s = 1;
        int e = stalls[n - 1];
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(stalls, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int k, int dis) {
        int cntcow = 1;
        int initialdis = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - initialdis >= dis) {
                cntcow++;
                initialdis = arr[i];
                if (cntcow == k)
                    return true;
            }
        }
        return false;
    }
}
