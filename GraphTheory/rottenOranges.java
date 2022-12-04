import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges {
    public static void main(String[] args) {
        int[][]grid = {{0,1,2},{0,1,2},{2,1,1}};
        System.out.println(orangesRotting(grid));
    }

    public static class Triplet
    {
        int f;
        int s;
        int t;
        Triplet(int f,int s,int t)
        {
            this.f = f;
            this.s = s;
            this.t = t;
        }
    }
    public static int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length; 
        Queue<Triplet> q = new LinkedList<>();
        int[][]vis = new int[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]==2)
                {
                    vis[i][j] =2;
                    q.add(new Triplet(i,j,0));
                }
            }
        }
        
       int ans = 0;
       int[] drow = {0,1,-1,0};
       int[] dcol = {1,0,0,-1};
       
       while(q.size()>0)
       {
           int row = q.peek().f;
           int col = q.peek().s;
           int time = q.peek().t;
           q.remove();
           ans = Math.max(ans,time);
           
           for(int i=0; i<4; i++)
           {
               int delrow = row +  drow[i];
               int delcol = col + dcol[i];
               if(delrow<n && delrow>=0 && delcol<m && delcol>=0 && vis[delrow][delcol]!=2 && grid[delrow][delcol]!=0)
               {
                   vis[delrow][delcol]=2;
                   q.add(new Triplet(delrow,delcol,time+1));
               }
               
           }
       }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(vis[i][j]!=2 && grid[i][j]==1)
                {
                    return -1;
                }
            }
        }
        return ans;
    }
}
