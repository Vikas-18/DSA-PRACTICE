
import java.util.*;
public class BFS_DFS {
   
        public static void main (String[] args) {
           
            ArrayList <ArrayList<Integer>> adj = new ArrayList<>();

            // adding new arraylists to 'adj' to add neighbour nodes
            for (int i = 0; i < 6; i++) {
                adj.add(new ArrayList < > ());
            }
    
            adj.get(1).add(2);
            adj.get(1).add(3);
            adj.get(1).add(4);
            adj.get(1).add(5);
            adj.get(2).add(4);
            adj.get(2).add(1);
            adj.get(3).add(1);
            adj.get(4).add(1);
            adj.get(4).add(2);
            adj.get(5).add(1);
    
    
            ArrayList < Integer > ans = dfsOfGraph(5, adj);
            printAns(ans);
    }
    public static ArrayList <Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList <Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue <Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (Integer it: adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;

    }

    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs) {
        storeDfs.add(node);
        //marking current node as visited
        vis[node] = true;

        //getting neighbour nodes
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj, storeDfs);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> storeDfs = new ArrayList<>();

        //boolean array to keep track of visited vertices
        boolean vis[] = new boolean[V+1];

        //If you are starting from node 2, then i should start from 2.
        for(int i = 1;i<=V;i++) {
            if(!vis[i]) dfs(i, vis, adj, storeDfs);
        }

        return storeDfs;
    }

    
}
