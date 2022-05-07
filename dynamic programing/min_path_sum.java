public class min_path_sum {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp = new int[3][3];
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[0].length; i++) {
                dp[index][i] = -1;
            }
        }
        // System.out.println(solve(arr, 2, 2, dp));
        System.out.println(tabulation(arr));
    }

    public static int solve(int[][]arr,int row,int col,int[][]dp)
  {
      if(row==0 && col==0)
      {
          return arr[0][0];
      }
      
      if(row<0 || col<0)
      {
         return 1000000;
      }
      
      if(dp[row][col]!=-1)
      {
          return dp[row][col];
      }
      
    
 
        int up = arr[row][col] +  solve(arr,row-1,col,dp);

        int left = arr[row][col] + solve(arr,row,col-1,dp);
       
           
           dp[row][col] = Math.min(up,left);   
           return Math.min(up,left);   
  }

  public static int tabulation(int[][]arr)
  {
      int[][] dp = new int[arr.length][arr[0].length];
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
            if(i==0 && j==0)
            {
               dp[i][j] =  arr[i][j];
            }
            else{
                int ans1 = 0;
                int ans2 = 0;

                if(i>0)
                ans1 = arr[i][j] + dp[i-1][j];
                else
                ans1 = 100000;

                if(j>0)
                ans2 = arr[i][j] + dp[i][j-1];
                else
                ans2 = 100000;

                dp[i][j] = Math.min(ans1,ans2);
            }
          }
      }
      return dp[arr.length-1][arr[0].length-1];
  }
}
