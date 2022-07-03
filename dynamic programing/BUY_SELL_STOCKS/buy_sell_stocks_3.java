package BUY_SELL_STOCKS;
public class buy_sell_stocks_3 {
    public static void main(String[] args) {
        int [] prices = {7,1,5,4,6};
        // int cap = 1;
        // int[][][]dp = new int[prices.length+1][2][cap+1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         for(int k=0; k<=cap; k++)
        //         dp[i][j][k] =-1;
        //     }
        // }

        int[][]dp = new int[prices.length+1][4];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] =-1;
            }
        }
        
        // int ans =  recu(0,1,cap,prices,prices.length,dp);
        // System.out.println(ans);
        System.out.println(solve2(prices, 0, 0, dp));


    }
   //Memorization
   public static int recu(int ind ,int buy,int cap,int[] price,int n,int dp[][][]){
    if(ind == n || cap ==0) return 0;
    if(dp[ind][buy][cap] != -1) return dp[ind][buy][cap];
    int profit = 0;
    if(buy == 1 ){
        profit = Math.max(-price[ind] + recu(ind+1,0,cap,price,n,dp),0+ recu(ind+1,1,cap,price,n,dp));
    } else {
        profit = Math.max(price[ind] + recu(ind+1,1,cap -1,price,n,dp),0+ recu(ind+1,0,cap,price,n,dp));
    }
    return dp[ind][buy][cap] = profit;
}

public static int solve2(int[]prices,int idx,int trans,int[][]dp)
{
    //base case
    if(idx==prices.length || trans==4)
    {
        return 0;
    }

    if(dp[idx][trans]!=-1)
    {
        return dp[idx][trans];
    }
      
    if(trans%2==0)//because buy will happen on even times e.g buy sell buy sell
    {
        return  dp[idx][trans] = Math.max(-prices[idx] + solve2(prices, idx+1,trans+1,dp),solve2(prices,idx+1,trans,dp));
    }

    else
    return dp[idx][trans] = Math.max(-prices[idx] + solve2(prices, idx+1,trans+1,dp),solve2(prices,idx+1,trans,dp));

}
}
