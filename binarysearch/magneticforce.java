import java.util.Arrays;

public class magneticforce {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 1000000000 };
        System.out.println(maxDistance(arr, 2));
    }

    public static int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int n = arr.length;
        int s = 1;
        int e = (int) (1e9);
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int ballsplaced = possible(arr, mid);
            if (ballsplaced == m) {
                ans = Math.max(ans, mid);
                s = mid + 1;
            } else if (ballsplaced > m) {
                s = mid + 1;
            }

            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int possible(int[] arr, int mid) {
        int cnt = 1;
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int dist = arr[j] - arr[i];
            if (dist < mid) {
                j++;
            } else if (dist == mid) {
                cnt++;
                i = j;
                j++;
            } else {
                i = j;
                j++;
            }

        }
        return cnt;
    }
}