import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class isBarpititeGraph {
    public static void main(String[] args) {
        
    }
    public boolean solve(int V,ArrayList<ArrayList<Integer>>adj,int[]color,int start)
    {
        Queue<Integer> q = new LinkedList<>();
        color[start] = 1;
        q.add(start);
        
        while(q.size()>0)
        {
            int idx = q.peek();
            q.remove();
            
            for(int i: adj.get(idx))
            {
                if(color[i]==-1)
                {
                    color[i]=1-color[idx];
                    q.add(i);
                }
                else if(color[i]==color[idx])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[]color = new int[V];
        for(int i=0; i<color.length; i++)
        {
            color[i]=-1;
        }
        
        for(int i=0; i<color.length; i++)
        {
            if(color[i]==-1)
            {
                if(solve(V,adj,color,i)==false)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
