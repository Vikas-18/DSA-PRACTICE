import java.util.Arrays;

public class goodpairsII {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 4 };
        int[] nums2 = { 1, 3, 4 };
        System.out.println(numberOfPairs(nums1, nums2, 1));
    }

    public static long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long ans = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            ans += solve(nums2, k, nums1[i]);
        }
        return ans;

    }

    public static long solve(int[] arr, int k, int num) {
        int s = 0;
        int e = arr.length - 1;
        long ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (num >= arr[mid] * k) {
                if (num % arr[mid] * k == 0)
                    ans++;
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return ans;

    }
}
