
import java.util.LinkedList;

import java.util.Queue;


public class max_Area_island {
    public static void main(String[] args) {
        int[][] grid ={{0,1,1},
                       {1,1,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][]vis = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                {
                    int area = calArea(grid,i,j,vis);
                    ans = Math.max(ans,area);
                }
            }
        }
       
        return ans;
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
    public static int calArea(int[][]arr,int sr,int sc,int[][]vis)
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
               
                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]==0 && arr[delrow][delcol]==1)
                {
                    q.add(new Pair(delrow,delcol));
                    area+=1;
                    vis[delrow][delcol] = 1;
                }
            }
        }
        return area;
    }
}
