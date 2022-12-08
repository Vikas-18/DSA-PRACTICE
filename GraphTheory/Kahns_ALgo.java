import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class Kahns_ALgo {
    public static void main(String[] args) {
        
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indegree = new int[V];
        //indegree calculation
        for(int i=0; i<adj.size(); i++)
        {
            for(int it: adj.get(i))
            {
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        //add those who have indegree zero
        for(int i=0; i<indegree.length; i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int[]ans = new int[V];
        int idx=0;
        //indegree decrease karo and if zero ho gaya then add to the ans
        while(q.size()>0)
        {
            int node = q.peek();
            q.remove();
            ans[idx++] = node;
            
            for(int it: adj.get(node))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    q.add(it);
                }
            }
        }
        return ans;
    }
}
