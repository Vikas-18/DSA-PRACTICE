/**
 * minoperations
 */
public class minoperations {

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 4 };
        int k = 1;
        System.out.println(minOperations(nums, k));

    }

    public static int minOperations(int[] nums, int k) {
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num = num | nums[i];
        }
        int[] arr1 = solve(num);
        int[] arr2 = solve(k);

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            if (arr1[i] != arr2[i]) {
                ans++;
            }
        }

        return ans;
    }

    public static int[] solve(int n) {
        int[] ans = new int[32];

        int idx = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans[idx] = 1;
            } else {
                ans[idx] = 0;
            }
            idx++;
            n = n >> 1;
        }
        return ans;
    }
}