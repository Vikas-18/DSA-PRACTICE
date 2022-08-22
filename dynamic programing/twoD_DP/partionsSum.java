package twoD_DP;

public class partionsSum {
    public static void main(String[] args) {
        int[]arr ={3 ,1 ,1 ,2 ,1};
        System.out.println(countPartitions(5, 0, arr));
    }

    public static int countPartitions(int n, int d, int[] arr) {
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        int t = (sum-d)/2;
         
		int[][]dp = new int[n][t+1];
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(arr,n-1,t,dp);
	}
    
    public static int solve(int[]arr,int idx,int t,int[][]dp)
    {
        //base case
        
        if(idx==0)
        {
            if(t==arr[0] || t==0)
            {
                return 1;
            }
            return 0;
        }
        if(dp[idx][t]!=-1)
        {
            return dp[idx][t];
        }
        int pick = 0;
        if(t>=arr[idx])
        {
            pick = solve(arr,idx-1,t-arr[idx],dp);
        }
        int notpick = solve(arr,idx-1,t,dp);
        dp[idx][t] = (pick + notpick);
        return dp[idx][t];
    }
}
