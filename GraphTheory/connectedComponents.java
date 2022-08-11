import java.util.ArrayList;

public class connectedComponents {
    public static void main(String[] args) {
          int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
          System.out.println(findCircleNum(isConnected));
    }
        public static int findCircleNum(int[][] isConnected) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
              int v = isConnected.length;
            for(int i=0; i<v; i++)
            {
               adj.add(new ArrayList<Integer>());
            }
             
             // converting adjacency matrix to adjcency list
             
              for(int i=0; i<v; i++)
            {
               for(int j=0; j<v; j++)
               {
                   if(isConnected[i][j]==1 && i!=j)//i!=j for not considering self loop
                   {
                       adj.get(i).add(j);
                       adj.get(j).add(i);
                   }
               }
            }
            int cnt = 0;
            boolean[] vis = new boolean[v];
            
            for(int i=0; i<v; i++)
            {
                if(vis[i]==false)
                {
                    cnt++;
                    dfs(adj,i,vis);
                }
            }
            return cnt;
         }
         
         public static void dfs(ArrayList<ArrayList<Integer>> adj,int node,boolean[]vis)
         {
             vis[node] = true;
           
             
             for(Integer it : adj.get(node))
             {
                 if(vis[it]==false)
                 {
                     vis[it] = true;
                     dfs(adj,it,vis);
                 }
             }
         }
    }

