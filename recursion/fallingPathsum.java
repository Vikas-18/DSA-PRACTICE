public class fallingPathsum {
    public static void main(String[] args) {
        int[][]matrix = {{2,1,3},{6,5,4},{7,8,9}};
    }
    public int minFallingPathSum(int[][] matrix) {
        int ans = (int)(1e9);
        int[][]dp = new int[matrix.length+1][matrix[0].length+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j] =-1;
            }
        }
        for(int j=0; j<matrix[0].length; j++)
        {
            ans = Math.min(ans,solve(matrix,0,j,dp));
        }
        return ans;
     
    }
    public int solve(int[][]arr,int i,int j,int[][]dp)
    {
        //base case
        if(i>=arr.length || j>=arr[0].length || j<0)
        {
            return (int)(1e9);
        }
        if(i==arr.length-1)
        {
            return arr[i][j];
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
     
        int down = arr[i][j] + solve(arr,i+1,j,dp);
        int diagonal1 = arr[i][j] + solve(arr,i+1,j+1,dp);
        int diagonal2 = arr[i][j] + solve(arr,i+1,j-1,dp);
    
        return dp[i][j] =  Math.min(down,Math.min(diagonal1,diagonal2)); 

    }
}
