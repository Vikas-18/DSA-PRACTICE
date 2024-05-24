import java.util.Arrays;

public class specialqueir {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 1, 6 };
        int[][] queries = { { 0, 2 }, { 2, 3 } };
        System.out.println(Arrays.toString(isArraySpecial(nums, queries)));
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] q) {
        boolean[] arr = new boolean[nums.length];

        int i = 0;
        int idx = 0;
        while (i < nums.length) {
            if (i == 0) {
                arr[idx] = true;
            } else if ((nums[i] == nums[i - 1]) || (nums[i] % 2 == 0 && nums[i - 1] % 2 == 0)
                    || (nums[i] % 2 != 0 && nums[i - 1] % 2 != 0)) {
                arr[idx] = false;
            } else {
                arr[idx] = true;
            }
            idx++;
            i++;

        }
        boolean[] ans = new boolean[q.length];
        idx = 0;
        for (i = 0; i < q.length; i++) {
            int f = q[i][0];
            int s = q[i][1];

            if (f == s) {
                ans[idx] = true;
            } else {
                boolean res = true;
                for (int j = f + 1; j <= s; j++) {
                    if (arr[j] == false) {
                        res = false;
                    }
                }
                ans[idx] = res;

            }
            idx++;
        }
        return ans;

    }
}
