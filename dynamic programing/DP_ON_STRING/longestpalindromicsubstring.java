package DP_ON_STRING;
/**
 * longestpalindromicsubstring
 */
public class longestpalindromicsubstring {

    public static void main(String[] args) {
        String s = "babad";
        String s1 = s;
        String s2 = new String();
        for (int i = s.length()-1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
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
                dp[ind1][ind2] = 0;
            
        }
    }

    String res = "";
    int temp =0;
    int row = 0;
    int col=0;
    for (int i = dp.length-1; i>=0; i--) {
        for (int j =dp[0].length -1; j >=0; j--) 
        {
           if(temp<dp[i][j])
           {
            temp = dp[i][j];
            row = i;
            col = j;
           }
        }
        
    }
    for (int i = 0; i < dp.length; i++) {
        for (int j = 0; j < dp[0].length; j++) {
            System.out.print(dp[i][j]);
        }
        System.out.println();
    }
    while(row>0 && col>0)
    {
        if(dp[row][col]!=0)
        res+=s.charAt(row-1);
        row--;
        col--;
    }
  System.out.println(res);
    

 }
}