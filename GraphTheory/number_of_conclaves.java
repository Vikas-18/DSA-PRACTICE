import java.util.LinkedList;
import java.util.Queue;

public class number_of_conclaves {
    public static void main(String[] args) {
        
    }
    public static class Pair
    {
        int f;
        int s;
        
        Pair(int f,int s)
        {
            this.f = f;
            this.s = s;
        }
    }

    public static int numberOfEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][]vis = new int[n][m];
        
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(i==0 || i==n-1 || j==0 || j==m-1)
                {
                    if(grid[i][j]==1)
                    {
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                    
                }
            }
        }
        int[] drow  = {1,-1,0,0};
        int[] dcol = {0,0,1,-1};
        
        while(q.size()>0)
        {
            int row  = q.peek().f;
            int col = q.peek().s;
            q.remove();
            
            for(int i=0; i<4; i++)
            {
                int delrow = row + drow[i];
                int delcol = col + dcol[i];
                
                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]==0 && grid[delrow][delcol]==1)
                {
                    q.add(new Pair(delrow,delcol));
                    vis[delrow][delcol] = 1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    
}
