import java.util.Arrays;

public class houserob {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        
        int[] dp  = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1 ;
        }
       
    }
    static int solve(int[] arr,int idx,int[]dp)
    {
        if(idx==0)
        {
            return arr[0];
        }
        if(idx<0)
        {
            return 0;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }

        int ans1 = arr[idx] + solve(arr, idx-2,dp); //pick
        int ans2 = solve(arr, idx-1,dp) ;// not pick 
        dp[idx] = Math.max(ans1, ans2);

        return Math.max(ans1, ans2);
    }

    static int solve(int[]arr,int ans)
    {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i =1; i<arr.length; i++) {

            int ans1 = arr[i];
            if(i>1)
            ans1+=dp[i-2];

            int ans2 = dp[i-1];

            dp[i] =  Math.max(ans1,ans2);
            
        }
        return dp[dp.length-1];
    }
}
