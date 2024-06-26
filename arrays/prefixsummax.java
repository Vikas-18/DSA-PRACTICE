public class prefixsummax {
    public static void main(String[] args) {
        int[] arr = { 12, 3, -6, 9, -7 };
        System.out.println(solve2(arr, 3));

    }

    public static int solve(int[] arr, int k) {
        int n = arr.length;
        int[] prefix = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        int i = 0;
        int j = k - 1;

        int ans = Integer.MIN_VALUE;
        while (j < n) {
            int currsum = Integer.MIN_VALUE;
            if (i >= 1)
                currsum = prefix[j] - prefix[i - 1];
            else
                currsum = prefix[j];
            ans = Math.max(ans, currsum);
            j++;
            i++;
        }
        return ans;

    }

    public static int solve2(int[] arr, int k) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int j = i;
            int sum = 0;
            int cnt = 0;
            while (j < n && cnt < k) {
                sum += arr[j];
                j++;
                cnt++;
            }
            if (cnt == k)
                ans = Math.max(ans, sum);
        }
        return ans;
    }
}
