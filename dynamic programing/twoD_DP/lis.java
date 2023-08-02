package twoD_DP;

/**
 * lis
 */
public class lis {

    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 5, 6, 2, 3, 1 };
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lis2(nums, 0, -1, dp));
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int lis2(int[] arr, int idx, int prev, int[][] dp) {
        // base case
        if (idx > arr.length - 1) {
            return 0;
        }
        if (dp[idx][prev + 1] != -1) {
            return dp[idx][prev + 1];
        }
        int nottake = lis2(arr, idx + 1, prev, dp);
        int take = 0;
        if (prev == -1 || arr[idx] > arr[prev]) {
            take = 1 + lis2(arr, idx + 1, idx, dp);
        }
        return dp[idx][prev + 1] = Math.max(nottake, take);
    }
}