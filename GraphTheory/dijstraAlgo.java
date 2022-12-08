import java.util.PriorityQueue;
import java.util.ArrayList;
public class dijstraAlgo {
    public static void main(String[] args) {
        
    }
    
    class Solution
    {
       static class Pair{
            int distance;
            int node;
            Pair(int distance,int node){
                this.distance=distance;
                this.node=node;
            }
            
        }
        //Function to find the shortest distance of all the vertices
        //from the source vertex S.
        static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
        {
            // Write your code here
            PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
            
            int dist[]=new int[V];
            for(int i=0;i<V;i++){
                dist[i]=(int)(1e9);
            }
            dist[S]=0;
            
            pq.add(new Pair(0,S));
            
            while(!pq.isEmpty()){
                int dis=pq.peek().distance;
                int node=pq.peek().node;
                pq.remove();
                for(ArrayList<Integer> it:adj.get(node)){
                    int edgeweight=it.get(1);
                    int adjedge=it.get(0);
                    if(dis+edgeweight<dist[adjedge]){
                        dist[adjedge]=dis+edgeweight;
                        pq.add(new Pair(dis+edgeweight,adjedge));
                    }
                }
            }
            
            return dist;
            
        }
    }
}
