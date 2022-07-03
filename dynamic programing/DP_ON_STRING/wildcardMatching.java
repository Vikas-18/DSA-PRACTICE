package DP_ON_STRING;
public class wildcardMatching {
    public static void main(String[] args) {
        String s= "aa";
        String p = "*";
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
       
        System.out.println(solve(s, p, n-1, m-1,dp));
    }

    public static boolean solve(String s, String p,int i , int j,boolean[][]dp)
    {
        //base case
        
        if(i<0 && j<0)
        {
            return true;
        }
        
        if(i<0 || j<0)
        {
            return false;
        }
        
        if(dp[i][j]!=false)
        {
            return dp[i][j];
        }
        
        // matching happens
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
        {
            return dp[i][j] =  solve(s,p,i-1,j-1,dp);
        }
        
        //not matching
        if(p.charAt(j)=='*')
        {
            return dp[i][j] =  solve(s,p,i-1,j,dp) || solve(s,p,i,j-1,dp);
        }
        return dp[i][j];
    }
}
