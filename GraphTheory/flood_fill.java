import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class flood_fill {
    public static void main(String[] args) {
        int[][]image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        
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
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length; 
        int m = image[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][]vis = new int[n][m];
        int[] drow = {1,-1,0,0};
        int[] dcol = {0,0,1,-1};
        int inicolor = image[sr][sc];
        vis[sr][sc] =color;
        image[sr][sc] = color;
        q.add(new Pair(sr,sc));
        while(q.size()>0)
        {
           int row = q.peek().f;
           int col = q.peek().s;
           q.remove();

           for(int i=0; i<4; i++)
           {
               int delrow = row + drow[i];
               int delcol = col + dcol[i];
               if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]!=color && image[delrow][delcol]==inicolor )
               {
                   vis[delrow][delcol] = color;
                   image[delrow][delcol] =color;
                   q.add(new Pair(delrow,delcol));
               }
           }
        }
        return image;
    }
}
