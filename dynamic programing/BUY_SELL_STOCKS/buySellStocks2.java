package BUY_SELL_STOCKS;

/**
 * buySellStocks2
 */
public class buySellStocks2 {

    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int[][]dp = new int[prices.length+1][2];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] =-1;
            }
        }
        System.out.println(solve(prices, 0, 1,dp));
    }
    public static int solve(int[]prices,int idx,int buy,int[][] dp)
    {
        // base case
        if(idx==prices .length)
        {
            return 0;
        }

        if(dp[idx][buy]!=-1)
        {
            return dp[idx][buy];
        }
        int profit =0;
        if(buy==1)
        { // take or not take if you have to buy either you buy it or you just move to next idx and then decide the same for that idx
            // if you take it then add -prices[idx] since your money has reduced
            //just take max of both since we need max profit
            profit = Math.max(-prices[idx] + solve(prices, idx+1, 0,dp),solve(prices, idx+1,1,dp));
        }
// take or not take, if you have to sell either you sell it or you just move to next idx and then decide the same for that idx
            // if you take it then add +prices[idx] since your money has increase just take max of sell since we need to maximse our profit
            else{
            profit =  Math.max(prices[idx]+solve(prices, idx+1, 1,dp),0+solve(prices, idx+1, 0,dp));
            }

            return dp[idx][buy] = profit;
    }
}





























































































































































































































