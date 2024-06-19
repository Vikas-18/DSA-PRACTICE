public class mBouquets {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 3, 10, 2 };
        System.out.println(minDays(arr, 3, 2));
    }

    public static int minDays(int[] arr, int m, int k) {
        int s = min(arr);
        int e = max(arr);

        int ans = (int) (1e9);

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (possible(arr, mid, k) >= m) {
                ans = Math.min(ans, mid);
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (ans == (int) (1e9)) {
            return -1;
        }
        return ans;
    }

    public static int min(int[] arr) {
        int ans = (int) (1e9);

        for (int i = 0; i < arr.length; i++) {
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }

    public static int max(int[] arr) {
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }

        return ans;
    }

    public static int possible(int[] arr, int mid, int k) {
        int ans = 0;

        int i = 0;
        int j = 0;
        int cnt = 0;
        while (j < arr.length) {
            if (arr[j] <= mid) {
                cnt++;
            }

            if (j - i + 1 == k) {
                if (cnt == k) {
                    cnt = 0;
                    i = j + 1;
                    ans++;
                } else {
                    if (arr[i] <= mid)
                        cnt--;
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}
