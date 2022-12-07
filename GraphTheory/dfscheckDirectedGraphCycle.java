/**
 * dfscheckDirectedGraphCycle
 */
import java.util.ArrayList;
public class dfscheckDirectedGraphCycle {

    public static void main(String[] args) {
        
    }
    public boolean dfscheck(int i, ArrayList<ArrayList<Integer>> adj,int[]vis,int[]pathvis)
    {
        vis[i] = 1;
        pathvis[i] =1;
        
        for(int it: adj.get(i))
        {
            if(vis[it]==0)
            {
                if(dfscheck(it,adj,vis,pathvis))
                {
                    return true;
                }
            }
            else if(pathvis[it]==1){
                return true;
            }
        }
        pathvis[i] = 0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
      int[]vis = new int[V];
      int[]pathvis = new int[V];
      
      for(int i=0; i<V; i++)
      {
          if(vis[i]==0)
          {
              if(dfscheck(i,adj,vis,pathvis)==true)
              {
                  return true;
              }
          }
      }
      return false;
    }
}