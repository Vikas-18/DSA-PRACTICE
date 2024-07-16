package BottomUp;

public class MCM {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[][] dp = new int[6][6];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(arr, dp, 1, 4));
    }
    // general template
    /*
     * fun(arr,i,j)
     * {
     * base condition
     * if(i>j)
     * {
     * return 0;
     * }
     * 
     * int ans=0;
     * 
     * for(int k=i; k<j; k++)
     * {
     * int tempans = fun(arr,i,k)+fun(arr,k+1,j)+some fucntion;
     * ans = Math.function(ans,tempans);
     * }
     * 
     * return ans;
     * }
     */

    public static int solve(int[] arr, int[][] dp, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        // k
        // 10 20 30 40 60
        // (10*30) * (30*60) => 10*30*60
        for (int k = i; k <= j - 1; k++) {
            int tempans = solve(arr, dp, i, k) + solve(arr, dp, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, tempans);
        }
        return dp[i][j] = ans;
    }
}
