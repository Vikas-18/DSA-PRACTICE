package twoD_DP;

public class coins_number {

    public static void main(String[] args) {
        int[]coins = {9,6,5,1};
        System.out.println(minCoins(coins, 4, 11));
    }
    public static int minCoins(int coins[], int M, int V) 
	{ 
	    int[][]dp = new int[M][V+1];
	    for(int i=0; i<M; i++)
	    {
	        for(int j=0; j<V+1; j++)
	        {
	            dp[i][j] =-1;
	        }
	    }
	    
	    return solve(coins,M-1,V,dp);
	} 
	
	public static int solve(int[] coins,int idx,int t,int[][]dp)
	{
	    //base case
     
       
	    if(idx==0)
	    {
           
	        if(t%coins[0]==0)
	        {
	            return 1;
	        }
	        return 100000;
	    }
	    
	    
	    if(dp[idx][t]!=-1)
	    {
	        return dp[idx][t];
	    }
	    //pick notpick strategy
	    int pick = 1000000;
	    if(coins[idx]<=t)
	    {
	        pick = solve(coins,idx,t-coins[idx],dp)+1;
	    }
	    
	    int notpick = solve(coins,idx-1,t,dp);
	    
	    return dp[idx][t] = Math.min(pick,notpick);
	}
}