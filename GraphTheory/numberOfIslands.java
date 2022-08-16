import java.util.LinkedList;
import java.util.Queue;

public class numberOfIslands {
    public static void main(String[] args) {
        char[][] grid =  
        {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

            System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        boolean[][]vis = new boolean[n][m];
        int cnt = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(vis[i][j]==false && grid[i][j]=='1')
                {
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    
    public static class Pair{
        int first = 0;
        int second = 0;
        
        Pair(int first,int second)
        {
           this.first = first;
           this.second = second;
        }
    }
    
    public static void bfs(int row,int col,boolean[][]vis,char[][]grid)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        vis[row][col] = true;
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty())
        {
            int noderow = q.peek().first;
            int nodecol = q.peek().second;
            q.remove();
            
            for(int i=-1; i<=1; i++)
            {
                //for checking only up left right and down
                if(i!=-1 && i!=1)
                for(int j=-1; j<=1; j++)
                {
                    int delrow = noderow + i;
                    int delcol = nodecol + j;
                    
                    if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]==false && grid[delrow][delcol]=='1')
                    {
                        vis[delrow][delcol] = true;
                        q.add(new Pair(delrow,delcol));
                    }
                }
                
                if(i==-1 || i==1)
                {
                     for(int j=0; j<1; j++)
                  {
                    int delrow = noderow + i;
                    int delcol = nodecol + j;

                    if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]==false && grid[delrow][delcol]=='1')
                    {
                        vis[delrow][delcol] = true;
                        q.add(new Pair(delrow,delcol));
                    }
                  }
                }
            }
        }
    }
}

