public class spiral2matrix {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(3);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        
        int cnt=0;
        int tne = n*n;
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = n-1;
        int lastvalue = 0;
        while(cnt<tne)
        {
            for(int i=minr,j=minc; j<=maxc && cnt<tne; j++)
            {
               ans[i][j] = lastvalue+1;
               lastvalue +=1;
                cnt++;
               
                
            }
            minr++;
            
              for(int i=minr,j=maxc; i<=maxr && cnt<tne; i++)
            {
                ans[i][j] = lastvalue+1;
                  lastvalue +=1;
                   cnt++;
            }
            maxc--;
            
              for(int i=maxr,j=maxc; j>=minc && cnt<tne; j--)
            {
                ans[i][j] = lastvalue+1;
                  lastvalue +=1;
                   cnt++;
            }
            maxr--;
            
              for(int i=maxr,j=minc; i>=minr && cnt<tne; i--)
            {
                ans[i][j] = lastvalue+1;
                  lastvalue +=1;
                   cnt++;
            }
            minc++;
        }
        return ans;
    }
}
