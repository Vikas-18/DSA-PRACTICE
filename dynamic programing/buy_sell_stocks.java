public class buy_sell_stocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,4,6};
        System.out.println(solve(prices));
        System.out.println(solve2(prices, 1, 0, 0));
    }
    public static int solve(int[] prices)
    {
        int profit = 0;
        int mini = prices[0];//maintaining min because we will need it in further process so that we can decide on which day we need to buy

        for (int i = 1; i < prices.length; i++) {
              int sell = prices[i] - mini;// selling on the ith day
              profit = Math.max(sell,profit);
              mini = Math.min(mini,prices[i]);
        }
        return profit;
    }
    public static int solve2(int[]prices,int buy,int count,int idx)
    {
        if(idx==prices.length || count>=1)
        {
            return 0;
        }

        if(buy==1)
        {
            return Math.max(-prices[idx] + solve2(prices, 0, count, idx+1),solve2(prices, 1, count, idx+1));
        }

        else
        return Math.max(prices[idx]+solve2(prices, 1, count+1, idx+1),solve2(prices,0, count, idx+1));
    }
}
