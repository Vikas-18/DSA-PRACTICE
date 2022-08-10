package twoD_DP;

public class subsetsumtarget {
    public static void main(String[] args) {
        int[]arr = {6,1,2,4};
        int[][]dp = new int[arr.length+1][5];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(solve(arr, 4, 3,dp));
    }

    public static boolean solve(int[] arr,int k,int idx,int[][]dp)
    {
        //base case
        if(idx<0)
        {
            return false;
        }
       if(k==0)
       {
         return true;
       }
        if(idx==0)
        {
            if(k==arr[0])
            {
                return true;
            }
        }

       
        if(dp[idx][k]!=-1)
        {
            if(dp[idx][k]==1)
            {
                return true;
            }
            return false;
        }
        boolean pick  = false;
        if(k>=arr[idx])
        pick = solve(arr,k-arr[idx],idx-1,dp);
        boolean notpick = solve(arr,k,idx-1,dp);
        
        boolean ans = pick || notpick;
        if(ans==true)
        {
            dp[idx][k] = 1;
        }
        else{
            dp[idx][k] = 0;
        }

        return ans;
    }
}
