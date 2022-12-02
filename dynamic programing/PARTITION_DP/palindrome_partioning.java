package PARTITION_DP;

public class palindrome_partioning {
    public static void main(String[] args) {
        int[][]dp = new int[5][5];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(solve("nitik", 0, 4,dp));
    }
    public static int solve(String s,int i,int j,int[][]dp)
    {
        if(i>=j)
        {
            return 0;
        }
        if(isPlaindrome(s,i,j)==true)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++)
        {
            int temp = solve(s, i, k,dp) + solve(s, k+1, j,dp) + 1;
            ans = Math.min(ans,temp);
        }
        return dp[i][j] =  ans;
    }
    private static boolean isPlaindrome(String s, int i, int j) {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
