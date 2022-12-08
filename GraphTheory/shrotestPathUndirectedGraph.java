import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class shrotestPathUndirectedGraph {
    
    public static void main(String[] args) {
        
    }
    class Pair
    {
        int f;
        int s;
        Pair(int f,int s)
        {
            this.f = f;
            this.s = s;
        }
    }
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        int[]dis = new int[n];
        for(int i=0; i<dis.length; i++)
        {
            dis[i] = (int)(1e9);
        }
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,0));
        
        while(q.size()>0)
        {
            int dist = q.peek().s;
            int node = q.peek().f;
            q.remove();
            dis[node] = Math.min(dist,dis[node]);
            
            for(int nbr: adj.get(node))
            {
                if(dis[nbr]==(int)(1e9))
                {
                    q.add(new Pair(nbr,dist+1));
                }
            }
        }
        for(int i=0; i<dis.length; i++)
        {
            if(dis[i]==(int)(1e9))
            {
                dis[i]= -1;
            }
        }
        return dis;
        
    }
}
