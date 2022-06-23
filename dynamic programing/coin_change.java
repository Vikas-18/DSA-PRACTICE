public class coin_change {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
       int[][] dp = new int[3][6];
       for (int i = 0; i < dp.length; i++) {
          for (int j = 0; j < dp[0].length; j++) {
             dp[i][j] =-1;
          }
       }
        System.out.println(solve3(arr, 5, 2,dp) );
    }
    static   int res = Integer.MAX_VALUE;
    public static  void solve(int[] arr,int target,int idx,int ans)
    {
       //base case
        if(idx==arr.length)
        {
            if(target==0)
            {
               res= Math.min(res,ans);
            }
            return;
        }
        
        
        
        //pick
        if(idx<arr.length && target>=arr[idx] ) 
        {
            ans+=1;
            solve(arr,target-arr[idx],idx,ans);
            ans-=1;
        }
        
        //not pick
        solve(arr,target,idx+1,ans);
        
    }

    public static  int solve2(int[] arr,int target,int idx,int[][] dp)
    {
       //base case
        if(idx==0)
        {
            if(target%arr[idx]==0)//always think of the base case as single element
            {
               return target/arr[idx];
            }
           return 9999999;
        }
        
        if(dp[idx][target]!=-1)
        return dp[idx][target];
        
        //pick
        int pick =Integer.MAX_VALUE;
        if(target>=arr[idx] ) 
            pick = solve2(arr,target-arr[idx],idx,dp)+1;
            
        
        
        //not pick
       int notpick =  solve2(arr,target,idx-1,dp);

      dp[idx][target] =  Math.min(notpick,pick);
      return dp[idx][target];
        
    }
//coin change 2 ways problem
    public static  int solve3(int[] arr,int target,int idx,int[][] dp)
    {
       //base case
        if(idx==0)
        {
            if(target%arr[0]==0)//always think of the base case as single element
            {
               return 1;
            }
           return 0;
        }
        
        if(dp[idx][target]!=-1)
        return dp[idx][target];
        
        //pick
        int pick =0;
        if(target>=arr[idx] ) 
            pick = solve3(arr,target-arr[idx],idx,dp);
            
        
        
        //not pick
       int notpick =  solve3(arr,target,idx-1,dp);

      dp[idx][target] =  notpick+pick;
      return dp[idx][target];
        
    }
}
