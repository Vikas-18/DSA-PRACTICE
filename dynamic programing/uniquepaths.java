public class uniquepaths {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        boolean[][] isvisited = new boolean[1][1];
        int[][] dp = new int[arr.length][arr[0].length];
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[0].length; i++) {
                dp[index][i] = -1;
            }
        }
        System.out.println(solve2(arr,isvisited,0,0,dp));
    }
    static int ans1 = 0;
    static int ans2 = 0;
    public static int solve(boolean[][] arr,int row,int col)
    {
        if(row==arr.length-1 && col==arr[0].length-1)
        {
            return 1;
        }

        if(row>=arr.length|| col>=arr[0].length)
        {
            return 0;
        }
        ans1 = solve(arr, row+1, col);
        ans2 = solve(arr, row, col+1);
       return ans1 + ans2;
    }

    public static int solve2(int[][]arr,boolean[][]isvisited,int row,int col,int[][]dp)
    {
        if(arr[row][col]!=1 && row==0 && col==0)
        {
            return 1;
        }
        
        if(row<0 || col<0)
        {
            return 0;
        }
        
        if(dp[0][0]!=-1)
        {
            return dp[row][col];
        }
        
         if(arr[row][col]!=1 && isvisited[row][col]==false)
        {
          isvisited[row][col] = true;  
          int up = solve2(arr,isvisited,row-1,col,dp);
          isvisited[row][col] = false; 
          isvisited[row][col] = true; 
          int left = solve2(arr,isvisited,row,col-1,dp);
          isvisited[row][col] = false;
             dp[row][col] = up+left;
            return up + left;
        }
        return 0;
    }
}
