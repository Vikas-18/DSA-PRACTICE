import java.util.PriorityQueue;

public class path_minimum {
    public static void main(String[] args) {
        
    }
    public class Triplet
    {
        int row;
        int col;
        int diff;
        Triplet(int row,int col,int diff)
        {
            this.row = row;
            this.col = col;
            this.diff = diff;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>((x,y)-> x.diff-y.diff);

        int[][]dis = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                dis[i][j] = (int)(1e9);
            }
        }
        pq.add(new Triplet(0,0,0));
        dis[0][0] = 0;
        int[]drow = {0,0,-1,1};
        int[]dcol = {1,-1,0,0};
        while(pq.size()>0)
        {
            int row = pq.peek().row;
            int col = pq.peek().col;
            int diff = pq.peek().diff;
            pq.remove();
            if(row==n-1 && col == m-1)
            {
                return diff;
            }

            for(int i=0; i<4; i++)
            {
                int delrow = row + drow[i];
                int delcol = col + dcol[i];

                if(delrow>=0 && delrow<n && delcol>=0 && delcol<m)
                {
                    int newdiff = Math.max(diff,Math.abs(heights[delrow][delcol]-heights[row][col]));
                    if(newdiff<dis[delrow][delcol])
                    {
                        dis[delrow][delcol] = newdiff;
                        pq.add(new Triplet(delrow,delcol,newdiff));
                    }
                   
                }
            }

        }
        return 0;
    }
}
