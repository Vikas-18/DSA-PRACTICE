
package twoD_DP;
public class targetSum {
    public static void main(String[] args) {
        int[] arr = {68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46 };
        int[][] dp = new int[arr.length+1][100000];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(arr, 0, 282, 0, dp));
    }
    public static boolean solve(int[] arr,int idx,int target,int sum,int[][]  dp)
    {
        if(idx==arr.length)
        {
            if(sum==target)
            {
                return true;
            }
            return false;
        }

        if(dp[idx][sum]!=-1)
        {
            if(dp[idx][sum]==1)
            {
                return true;
            }
            return false;
        }


        sum+=arr[idx];
        boolean ans1 = solve(arr, idx+1, target, sum, dp);
        sum-=arr[idx];
        boolean ans2 = solve(arr, idx+1, target, sum, dp);

        if(ans1|ans2)
        {
            dp[idx][sum] = 1;
        }
        else if(ans1|ans2==false)
        {
            dp[idx][sum] = 0;
        }
        return ans1|ans2;
    }
}
