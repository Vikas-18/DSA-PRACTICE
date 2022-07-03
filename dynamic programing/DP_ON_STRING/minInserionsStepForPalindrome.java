package DP_ON_STRING;
public class minInserionsStepForPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        String s1 = s;
        String s2 = new String();
        for (int i = s.length()-1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
       int ans = solve2(s1, s2);
       System.out.println(s.length()-ans);
    }
// same LCS code, we are just keeping the longest common palindromic substring and then just making insertions on the remaing part thats why returning s.length()-ans
    public static int solve2(String s1,String s2)
    {
        int n=s1.length();
    int m=s2.length();

    int dp[][]=new int[n+1][m+1];
    for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dp[i][j] = -1;
            }
        }
    
    
    for(int i=0;i<=n;i++){
        dp[i][0] = 0;
    }
    for(int i=0;i<=m;i++){
        dp[0][i] = 0;
    }
  
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
            {
                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                
            }
            else
                dp[ind1][ind2] = Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
            
        }
    }
    
    return dp[n][m];
    }
}
