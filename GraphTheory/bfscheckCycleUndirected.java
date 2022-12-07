import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

public class bfscheckCycleUndirected {
    public static void main(String[] args) {
        
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[]vis = new boolean[V+1];
        
        for(int i=0; i<V; i++)
        {
            if(vis[i]==false)
            {
                if(solve(i,adj,vis))
                {
                    return true;
                }
            }
        }
        
        return false;
    }
    public class Pair{
        int first = 0;
        int second = 0;
        Pair(int first,int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public boolean solve(int src,ArrayList<ArrayList<Integer>> adj,boolean[]vis)
    {
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(src,-1));
            vis[src] = true;
            
            while(q.size()>0)
            {
                    int node = q.peek().first;
                    int parent = q.peek().second;
                    q.remove();
                    
                    for(int adjacentnode : adj.get(node))
                    {
                        if(vis[adjacentnode]==false)
                        {
                            vis[adjacentnode]=true;
                            q.add(new Pair(adjacentnode,node));
                        }
                        
                        else if(parent!=adjacentnode)
                        {
                            return true;
                        }
                    }
            }
            return false;
    }
}
