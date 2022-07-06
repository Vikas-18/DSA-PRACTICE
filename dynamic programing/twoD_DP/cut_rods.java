package twoD_DP;
public class cut_rods {
    public static void main(String[] args) {
        int n= 5;
        int[] price = {2 ,5 ,7 ,8 ,10};
        int[][] dp = new int[price.length+1][n+1];
        for (int i = 0; i < dp.length; i++) {
           for (int j = 0; j < dp[0].length; j++) {
              dp[i][j] =-1;
           }
        }
        System.out.println(cutRodUtil(price, n-1, n, dp));
    }

    static int cutRodUtil(int[] price, int ind, int N,int[][] dp){

        if(ind == 0){
            return N*price[0];
        }
        
        if(dp[ind][N]!=-1)
            return dp[ind][N];
            
        int notTaken = 0 + cutRodUtil(price,ind-1,N,dp);
        
        int taken = Integer.MIN_VALUE;
        int rodLength = ind+1;
        if(rodLength <= N)
            taken = price[ind] + cutRodUtil(price,ind,N-rodLength,dp);
            
        return dp[ind][N] = Math.max(notTaken,taken);
    }    
}
