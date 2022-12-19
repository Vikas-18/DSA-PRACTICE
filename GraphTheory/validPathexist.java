import java.util.ArrayList;
public class validPathexist {
    public static void main(String[] args) {
        int[][]edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int source = 0, destination = 5;
        System.out.println(validPath(6, edges, source, destination));
    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        int[]vis = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        dfs(source,adj,vis);
        if(vis[destination]==0)
        return false;

        return true;
        
    }
    public static void dfs(int src,ArrayList<ArrayList<Integer>> adj,int[]vis)
    {
        vis[src] = 1;

        for(int it: adj.get(src))
        {
            if(vis[it]==0)
            {
                dfs(it,adj,vis);
            }
        }
    }
}
