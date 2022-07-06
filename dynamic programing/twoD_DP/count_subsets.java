package twoD_DP;
public class count_subsets {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        int[][] dp = new int[arr.length+1][10000];
        System.out.println(count(arr, 10, dp));
    }

    public static int count(int[] arr,int target, int[][] dp)
    {
        int ans=0;
       for (int i = 0; i < dp.length; i++) {
           for (int j = 0; j < dp[0].length; j++) {
               if(i==0)
               {
                   dp[i][j] = 0;
               }
               if(j==0)
               {
                 dp[i][j] = 1;
               }

               if(arr[i-1]<=j)
               {
                   dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
               }
               else{
                   dp[i][j] = dp[i+1][j];
               }
               ans = dp[i][j];
           }
          
       }
       return ans;
    }
}
