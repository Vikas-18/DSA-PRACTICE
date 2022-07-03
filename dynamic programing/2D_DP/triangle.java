/**
 * triangle
 */

public class triangle {

    public static void main(String[] args) {
        /*
         * 2
         * 3 4
         * 6 5 7
         * 4 1 8 3
         */
        int[][] dp = new int[25][25];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        int[][] arr = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int ans = solve(arr, 0, 0,dp);
        System.out.println(ans);
    }

    public static int solve(int[][]arr,int i,int j,int[][]dp)
    {
        //base case

        if(i==arr.length-1)
        {
            return arr[i][j];
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int downsum =0;
        if(i<arr.length)
        downsum = arr[i][j] + solve(arr, i+1, j,dp);

        int diagonalsum =0;
        if(i<arr.length && j<arr.length)
        diagonalsum = arr[i][j] + solve(arr, i+1, j+1,dp);

        return dp[i][j] =  Math.min(downsum, diagonalsum);

    }
    
}