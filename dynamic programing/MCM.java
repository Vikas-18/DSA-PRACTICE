
public class MCM {
    public static void main(String[] args) {
        int[]arr= {10,20,30,40,50};
        int[][]dp = new int[6][6];
        System.out.println(solve(arr, 1, 4, dp));
    }

    public static int solve(int[]arr,int i,int j,int[][]dp)
    {
        if(i==j)
        {
            return 0;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int mini = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int steps = arr[i-1]*arr[k]*arr[j] + solve(arr, i, k, dp) + solve(arr, k+1, j, dp);
            if(steps<mini)
            {
                mini = steps;
            }
        }

        return dp[i][j] = mini;
    }
}

