import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class valid_Path {
    public static void main(String[] args) {
        int A = 2;
        int[][]B =  { {1, 2}};
        // {4, 1},
        // {2, 4} ,
        // {3, 4} ,
        // {5, 2} ,
        // {1, 3} };
        System.out.println(solve(A, B));
    }
    public static int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = B.length;
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++)
        {
            adj.get(B[i][0]-1).add(B[i][1]-1);
        }
        boolean[] vis = new boolean[2*n];
        bfs(adj,vis,1,A);
        if(vis[A]==true)
        {
            return 1;
        }
        return 0;
    }
    public static void bfs(ArrayList<ArrayList<Integer>> adj,boolean[]vis,int root,int des)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(root);
        vis[root] = true;
        while(!q.isEmpty())
        {
            int currNode = q.peek();
            q.remove();
            for(Integer nbrNode : adj.get(currNode))
            {
                if(!vis[nbrNode])
                {
                    vis[nbrNode] = true;
                    q.add(nbrNode);
                }
            }
        }
    }
}
