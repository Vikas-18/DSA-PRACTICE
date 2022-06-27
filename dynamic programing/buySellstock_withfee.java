public class buySellstock_withfee {
    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int[][]dp = new int[prices.length+1][2];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] =-1;
            }
        }

        System.out.println(solve(prices, 2, 0, dp, 1));
    }
    public static int solve(int[] prices,int fee,int idx,int[][]dp,int buy)
    {
        //base case
        if(idx==prices.length)
        {
            return 0;
        }
        
        if(dp[idx][buy]!=-1)
        {
            return dp[idx][buy];
        }
        
        //if i want to buy
        if(buy==1)
        {
            return dp[idx][buy] = Math.max(-prices[idx]+solve(prices,fee,idx+1,dp,0),solve(prices,fee,idx+1,dp,1));
        }
        // if i want to sell
        else
        {
           return dp[idx][buy] = Math.max(prices[idx]-fee+solve(prices,fee,idx+1,dp,1),solve(prices,fee,idx+1,dp,0));
        }
        

    }
}
