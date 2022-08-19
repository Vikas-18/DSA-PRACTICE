
import java.util.LinkedList;
import java.util.Queue;

public class matrix01 {
    public static void main(String[] args) {
        int[][]mat = {{0,0,0},{0,1,0},{1,1,1}};
        mat = updateMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][]arr = mat;
        int n = arr.length;
        int m = arr[0].length;
        boolean[][]vis = new boolean[n][m];
        Queue<Info> q = new LinkedList<>();
        
        for(int i=0; i<n; i++)
        {
           for(int j=0; j<m; j++)
           {
              if(arr[i][j]==0)
              {
                  q.add(new Info(i,j,0));
                  vis[i][j]=true;
              }
           }
        }
        
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;
            q.remove();
            arr[row][col] = step;
            int[] delrow = {-1,1,0,0};
            int[] delcol = {0,0,-1,1};
            
            for(int i=0; i<4; i++)
            {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==false)
                {
                    vis[nrow][nrow]=true;
                    q.add(new Info(nrow,ncol,step+1));
                }
                
            }
        }
        return arr;
    }
    
    public static class Info{
        int first = 0;
        int second = 0;
        int third = 0;
        
        Info(int first, int second,int third)
        {
          this.first = first;
            this.second = second;
            this.third = third;
        }
    }
}
