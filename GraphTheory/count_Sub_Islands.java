import java.util.LinkedList;
import java.util.Queue;

public class count_Sub_Islands {
    public static void main(String[] args) {
        int[][] grid1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
        int[][]grid2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
        int n = grid1.length;
        int m = grid1[0].length;
        int[][]vis = new int[n][m];

        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if(grid2[i][j]==1 && vis[i][j]==0)
                {
                    solve(grid1, grid2, i, j, vis);
                }
            }
        }
        for (int i = 0; i < vis.length; i++) {
            for (int j = 0; j < vis[0].length; j++) {
                System.out.print(vis[i][j]);
            }
            System.out.println();
        }
    }
    public static class Pair{
        int f;
        int s;
        Pair(int f,int s)
        {
            this.f = f;
            this.s = s;
        }
    }
    public static void solve(int[][]arr1,int[][]arr2,int sr,int sc,int[][]vis)
    {
        int n = arr1.length;
        int m = arr1[0].length;
       
        Queue<Pair> q = new LinkedList<>();
      
        if(arr1[sr][sc]==1 && arr2[sr][sc]==1)
        {
            q.add(new Pair(sr,sc));
            vis[sr][sc] = 1;
        }
        int[]drow = {1,-1,0,0};
        int[]dcol = {0,0,1,-1};
        while(q.size()>0)
        {
            int row = q.peek().f;
            int col = q.peek().s;
            q.remove();
            for(int i=0; i<4; i++)
            {
                int delrow = row + drow[i];
                int delcol = col + dcol[i];

                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && arr1[delrow][delcol]==1 && arr2[delrow][delcol]==1 && vis[delrow][delcol]==0)
                {
                    q.add(new Pair(delrow,delcol));
                    vis[delrow][delcol] =1;
                }
                else if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && arr1[delrow][delcol]==0 && arr2[delrow][delcol]==1 && vis[delrow][delcol]==0)
                {

                }
            }
        }
    }
}
