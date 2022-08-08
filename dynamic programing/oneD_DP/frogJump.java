package oneD_DP;

public class frogJump {
    public static void main(String[] args) {
        int[] heights = {10,20,30,10};
       
        System.out.println(spaceoptimization(heights));
    }

    public static int solve(int n,int[] heights,int idx)
    {
        if(idx==0)
        {
            return 0;
        }
        
        int left = solve(n,heights,idx-1) + Math.abs(heights[idx]-heights[idx-1]);
        int right = Integer.MAX_VALUE;
        if(idx>1)
             right = solve(n,heights,idx-2) + Math.abs(heights[idx]-heights[idx-2]);
        
        return Math.min(right,left);
            
    }
    public static int solve2(int n,int[] heights,int idx,int[]dp)
    {
        if(idx==0)
        {
            return 0;
        }
        
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        
        int left = solve2(n,heights,idx-1,dp) + Math.abs(heights[idx]-heights[idx-1]);
        int right = Integer.MAX_VALUE;
        if(idx>1)
             right = solve2(n,heights,idx-2,dp) + Math.abs(heights[idx]-heights[idx-2]);
        
        return dp[idx] =  Math.min(right,left);
            
    }

    public static int tabulation(int[] heights)
    {
        int[]dp = new int[heights.length];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            int left = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
                 right = dp[i-2] + Math.abs(heights[i]-heights[i-2]);

            dp[i] = Math.min(right, left);
            
        }
        return dp[dp.length-1];
    }

    public static int spaceoptimization(int[] heights)
    {
        int prev2 = 0;
        int prev = 0;
        for (int i = 1; i < heights.length; i++) {
            int left = prev + Math.abs(heights[i]-heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
                 right = prev2 + Math.abs(heights[i]-heights[i-2]);

            int curi = Math.min(right, left);

            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}
