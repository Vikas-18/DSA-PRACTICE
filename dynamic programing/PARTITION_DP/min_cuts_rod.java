package PARTITION_DP;
import java.util.Arrays;

public class min_cuts_rod {
    public static void main(String[] args) {
        int[]cuts = {5,6,1,4,2};
        Arrays.sort(cuts);//for maintaining the subproblem to be independent
        int[][]dp = new int[cuts.length+3][cuts.length+3];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[i][j] = -1;
            }
        }
        int[]arr = new int[cuts.length+2];
        arr[0] = 0;
        arr[arr.length-1] = 9;
        for (int i = 1; i < arr.length-1; i++) {
            arr[i] = cuts[i-1];
        }
        System.out.println(solve(arr, 9, 1, cuts.length, dp));

    }

    public static int solve(int[]cuts,int length,int i,int j,int[][]dp)
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

        int mini = Integer.MAX_VALUE;
        for (int index = i; index <=j; index++) {
            int cost = cuts[j+1]- cuts[i-1] + solve(cuts, length, i, index-1, dp)+solve(cuts, length, index+1, j, dp);
           
            mini = Math.min(mini,cost); 
        }

        return dp[i][j] =  mini;
    }
}
