package twoD_DP;
public class uniquepaths {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        boolean[][] isvisited = new boolean[1][1];
        int[][] dp = new int[3][7];
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr[0].length; i++) {
                dp[index][i] = -1;
            }
        }
        System.out.println(solve2(arr,isvisited,0,0,dp));
        System.out.println(tabulation(2,6));

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

    static int tabulation(int m, int n)
    {

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0)
                {
                    dp[i][j] = 1;
                }

                else{
                    int ans1 =0;
                    int ans2 = 0;

                    if(i>0)
                    ans1 = dp[i-1][j];
                    if(j>0)
                    ans2 = dp[i][j-1];

                    dp[i][j] = ans1 + ans2;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
