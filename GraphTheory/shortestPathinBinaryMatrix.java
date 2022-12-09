import java.util.LinkedList;
import java.util.Queue;

public class shortestPathinBinaryMatrix {
    public static void main(String[] args) {
        
    }
    public class Triplet
    {
        int row;
        int col;
        int dis;
        Triplet(int row,int col,int dis)
        {
            this.row = row;
            this.col = col;
            this.dis = dis;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        //using dijkstra Algo
        int n = grid.length;
        int m = grid[0].length;
       int[][]dis = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dis[i][j] = (int)(1e9);
            }
        }
        int sr  =0;
        int sc = 0;
        int desr = n-1;
        int desc = m-1;
        if(sr==desr && sc==desc && grid[sr][sc]==0 && grid[desr][desc]==0)
        {
            return 1;
        }
         if(grid[sr][sc]==1 || grid[desr][desc]==1)
        {
            return -1;
        }
        Queue<Triplet> q = new LinkedList<>();
        q.add(new Triplet(sr,sc,0));
        int[] drow = {0,0,1,-1,1,-1,-1,1};
        int[] dcol = {-1,1,0,0,1,-1,1,-1};
        while(q.size()>0)
        {
            int row = q.peek().row;
            int col = q.peek().col;
            int dist = q.peek().dis;
            if(row==desr && col==desc)
            {
                return dist+1;
            }
            q.remove();

            for(int i=0; i<8; i++)
            {
                int delrow = row + drow[i];
                int delcol = col + dcol[i];

                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && grid[delrow][delcol]==0 && dist+1<dis[delrow][delcol])
                {
                    dis[delrow][delcol] = dist + 1;
                    q.add(new Triplet(delrow,delcol,dis[delrow][delcol]));
                }
            }
        }
        return -1;
    }
}
