import java.util.LinkedList;
import java.util.Queue;

public class otoX {
    public static void main(String[] args) {
        int n = 5, m = 4;
        char[][]mat = {{'X', 'X', 'X', 'X'}, 
               {'X', 'O', 'X', 'X'}, 
               {'X', 'O', 'O', 'X'}, 
               {'X', 'O', 'X', 'X'}, 
               {'X', 'X', 'O', 'O'}};
               System.out.println(fill(n, m, mat));
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
    static char[][] fill(int n, int m, char a[][])
    {
       int[][] vis = new int[n][m];
       Queue<Pair> q = new LinkedList<>();
       
       for(int i=0; i<n; i++)
       {
          if(a[i][0]=='O')
          {
              q.add(new Pair(i,0));
              vis[i][0] = -1;
          }
          
          else if(a[i][m-1]=='O')
          {
              q.add(new Pair(i,m-1));
              vis[i][m-1] = -1;
          }
       }
       
       for(int j=0; j<m; j++)
       {
           if(a[0][j]=='O')
           {
               q.add(new Pair(0,j));
               vis[0][j] = -1;
           }
           else if(a[n-1][j]=='O')
           {
               q.add(new Pair(n-1,j));
               vis[n-1][j]=-1;
           }
       }
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
               
               if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]!=-1 && a[delrow][delcol]=='O')
               {
                   vis[delrow][delcol] = -1;
                   q.add(new Pair(delrow,delcol));
               }
           }
       }
       
       for(int i=0; i<n; i++)
       {
           for(int j=0; j<m; j++)
           {
               if(a[i][j]=='O' && vis[i][j]!=-1)
               {
                   a[i][j] = 'X';
               }
           }
       }
       return a;
       
    }
}
