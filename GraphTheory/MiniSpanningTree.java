import java.util.PriorityQueue;
import java.util.ArrayList;
public class MiniSpanningTree {
    public static void main(String[] args) {
        
    }
    public static class Pair
    {
        int node;
        int wt;
        Pair(int node,int wt)
        {
            this.node = node;
            this.wt = wt;
        }
    }
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)-> x.wt-y.wt);
        int[]vis = new int[V];
        pq.add(new Pair(0,0));
        int sum=0;
        while(pq.size()>0)
        {
            int node = pq.peek().node;
            int wt = pq.peek().wt;
            pq.remove();
            if(vis[node]==1)
            {
                continue;
            }
            
            vis[node]=1;
            sum+=wt;
            for(int i=0; i<adj.get(node).size(); i++)
            {
                int adjnode = adj.get(node).get(i).get(0);
                int edwt = adj.get(node).get(i).get(1);
                
                if(vis[adjnode]==0)
                {
                    pq.add(new Pair(adjnode,edwt));
                }
            }
        }
        
        return sum;
        
    }
}
