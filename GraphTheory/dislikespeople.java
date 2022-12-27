import java.util.ArrayList;
public class dislikespeople {
    public static void main(String[] args) {
        int[][]dislikes = {{1,2},{1,3},{2,3}};
        System.out.println(possibleBipartition(4, dislikes));
    }
    public static boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj  = new ArrayList<>();
        for(int i=0; i<=n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<dislikes.length; i++)
        {
            adj.get(dislikes[i][0]).add(dislikes[i][1]);
        }

        int[] vis = new int[n+1];
        int[]pathvis = new int[n+1];
        for(int i=0; i<dislikes.length; i++)
        {
            if(vis[i]==0)
            {
                if(dfscheck(i,adj,vis,pathvis)==true)
                {
                    return false;
                }
            }
        }
        return true;
    }
     public static boolean dfscheck(int i, ArrayList<ArrayList<Integer>> adj,int[]vis,int[]pathvis)
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
}
