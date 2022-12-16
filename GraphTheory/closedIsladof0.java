import java.util.LinkedList;
import java.util.Queue;

public class closedIsladof0 {
    public static void main(String[] args) {
        int[][]grid = {{0,0,1,1,0,1,0,0,1,0},{1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},{0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,1,1,0,1,1,0,1,1,0}};
        System.out.println(closedIsland(grid));
    }
    public static int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][]vis = new int[n][m];
        int ans = 0;
         for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(i==0 || i==n-1 || j==0 || j==m-1)
                {
                    if(grid[i][j]==0 && vis[i][j]==0)
                    {
                       solve(grid,i,j,vis);
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(i!=0 && i!=n-1 && j!=0 && j!=m-1)
                {
                    if(grid[i][j]==0 && vis[i][j]==0)
                    {
                       solve(grid,i,j,vis);
                       ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static  class Pair
    {
        int f;
        int s;
      
        Pair(int f,int s)
        {
            this.f = f;
            this.s = s;
        }
    }
    public static void solve(int[][]arr,int sr,int sc,int[][]vis)
    {
        int n = arr.length;
        int m = arr[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        vis[sr][sc] = 1;
        int area = 1;
        int[] drow = {1,-1,0,0};
        int[] dcol = {0,0,1,-1};
        while(q.size()>0)
        {
            int row = q.peek().f;
            int col = q.peek().s;
            q.remove();

            for(int i=0; i<4; i++)
            {
                int delrow = row + drow[i];
                int delcol = col + dcol[i];
               
                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]==0 && arr[delrow][delcol]==0)
                {
                    q.add(new Pair(delrow,delcol));
                    area+=1;
                    vis[delrow][delcol] = 1;
                }
            }
        }
    }
}
