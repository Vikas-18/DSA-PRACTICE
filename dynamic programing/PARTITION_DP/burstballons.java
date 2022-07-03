package PARTITION_DP;
public class burstballons {
    public static void main(String[] args) {
        int[] burst = {3,1,5,8};
        int[]arr = new int[burst.length+2];
        arr[0] = 1;
        arr[arr.length-1]=1;
        for (int i = 1; i < arr.length-1; i++) {
            arr[i] = burst[i-1];
        }
        int[][] dp = new int[arr.length+3][arr.length+3];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(arr, 1,burst.length, dp));

    }

    public static int solve(int[]burst,int i ,int j,int[][]dp)
    {
        //base case
        if(i>j)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int maxi = 0;
        for (int index = i; index<=j; index++) {
            //just imagine theres only one ballon left so you will burst it and you will get points burst[i-1]*burst[index]*burst[j+1] i,e 1*burst*1 so, we have done that only and calls the recursion for further cases
            int points =burst[i-1]*burst[index]*burst[j+1] + solve(burst, i, index-1,dp) + solve(burst, index+1, j,dp);
            maxi = Math.max(maxi,points);
        }

        return dp[i][j] =  maxi;
    }
}
