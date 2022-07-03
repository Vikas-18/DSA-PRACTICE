import java.util.Arrays;

public class jumpgames {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        System.out.println(solve(arr, 0,0,dp));

    }
    
    public static boolean ans = false;
    public static boolean solve(int[] arr,int idx,int[]dp)
    {
        if(idx==arr.length-1)
        {
            ans = true;
            return true;
        }
        if(idx>=arr.length)
        {
            return false;
        }
        if(dp[idx]!=-1)
        {
            if(dp[idx]==1)
            {
                return true;
            }
            else{
                return false;
            }
        }
        for(int i=1; i<=arr[idx]; i++)
        {
           boolean ans1 = solve(arr,idx+i,dp);
           if(ans1)
           {
               dp[idx] = 1;
           }
           else{
               dp[idx] = 0;
           }
        }
        return ans;
    }
    public static int minsum = 10000;
    public static int solve(int[]arr,int idx,int sum,int[]dp)
    {
        if(idx==arr.length-1)
        {
            minsum = Math.min(sum, minsum);
            return 0;
        }
        if(idx>=arr.length)
        {
            return 0;
        }
        
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        
        for(int i=1; i<=arr[idx]; i++)
        {
           
          int ans = solve(arr,idx+i,sum+1,dp);
           dp[idx] = ans;
        }
        return minsum;
    }
}
