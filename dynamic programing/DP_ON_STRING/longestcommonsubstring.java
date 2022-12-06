package DP_ON_STRING;
public class longestcommonsubstring {
    public static void main(String[] args) {
        String s1= "abcdefg";
        String s2 = "cdabcd";
        System.out.println(solve2(s1, s2));
    }
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
    int ans = 0;
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
            {
                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                ans = Math.max(dp[ind1][ind2],ans);
            }
            else
                dp[ind1][ind2] = 0;// since its value doesnot depends upon previous 2 values 
            
        }
    }
    
    return ans;
    }
}
