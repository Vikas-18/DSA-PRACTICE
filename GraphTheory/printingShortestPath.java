import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class printingShortestPath {
    public static void main(String[] args) {
        
    }
    static class Pair
    {
        int node;
        int wt;
        Pair(int node ,int wt)
        {
            this.node = node;
            this.wt = wt;
        }
    }
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++)
        {
            adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)-> x.wt-y.wt);
        int[]dis = new int[n+1];
        int[]parent = new int[n+1];
        
        for(int i=1; i<n+1; i++)
        {
            dis[i]  = (int)(1e9);
            parent[i] = i;
        }
        dis[1] = 0;
        pq.add(new Pair(1,0));
        
        while(pq.size()>0)
        {
            int node = pq.peek().node;
            int dist = pq.peek().wt;
            pq.remove();
            
            for(Pair p : adj.get(node))
            {
                int edgewt = p.wt;
                int nbrnode = p.node;
                if(dist + edgewt<dis[nbrnode])
                {
                    dis[nbrnode] = dist + edgewt;
                    parent[nbrnode] = node;
                    pq.add(new Pair(nbrnode,dis[nbrnode]));
                }
            }
        }
        
       
        List<Integer> ans = new ArrayList<>();
             int node = n;
           if(dis[n]==(int)(1e9))
           {
               ans.add(-1);
               return ans;
           }
        
   
        while(parent[node]!=node)
        {
            ans.add(node);
            node = parent[node];
        }
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
