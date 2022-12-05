
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
    public static int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length; 
        Queue<Triplet> q = new LinkedList<>();
        int[][]vis = new int[n][m];
        int[][]ans = new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Triplet(i,j,0));
                    ans[i][j] = 0;
                    vis[i][j] =1;
                }
            }
        }

        int[]drow = {1,-1,0,0};
        int[]dcol = {0,0,1,-1};

        while(q.size()>0)
        {
            int row = q.peek().f;
            int col = q.peek().s;
            int dis = q.peek().t;
            ans[row][col] = dis;
            q.remove();

            for(int i=0; i<4; i++)
            {
                int delrow = row + drow[i];
                int delcol = col + dcol[i];

                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m && vis[delrow][delcol]==0)
                {
                    q.add(new Triplet(delrow,delcol,dis+1));
                    vis[delrow][delcol]=1;
                }
            }
        }
        return ans;
    }
}
