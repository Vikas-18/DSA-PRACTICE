
public class topologicalSort {

    // public static void main(String[] args) {
        
    // }
    // public static void dfs(int start,int[]vis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st)
    // {
    //     vis[start] = 1;
        
        
    //     for(Integer i: adj.get(start))
    //     {
    //         if(vis[i]==0)
    //         {
    //             dfs(i,vis,adj,st);
    //         }
    //     }
    //     st.add(start);// after function call is over we add it to the stack
    // }
    // //Function to return list containing vertices in Topological order. 
    // static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    // {
    //     int[]vis = new int[V];
    //     Stack<Integer> st = new Stack<>();
        
    //     for(int i=0; i<V; i++)
    //     {
    //         if(vis[i]==0)
    //         {
    //             dfs(i,vis,adj,st);
    //         }
    //     }
        
    //     int[]ans = new int[V];
    //     int idx=0;
    //     while(st.size()>0)
    //     {
    //         ans[idx++] = st.peek();
    //         st.pop();
    //     }
    //     return ans;
    // }
}