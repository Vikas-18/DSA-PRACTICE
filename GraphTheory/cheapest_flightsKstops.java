import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class cheapest_flightsKstops {
    public static void main(String[] args) {
        
    }
    public class Pair
    {
        int f;
        int s;
        Pair(int f,int s)
        {
            this.f = f;
            this.s = s;
        }
    }
    public class Triplet
    {
        int src;
        int stop;
        int dis;
        Triplet(int src,int stop,int dis)
        {
            this.src = src;
            this.stop = stop;
            this.dis = dis;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for(int i=0; i<m; i++)
        {
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        int[]dis = new int[n];
        dis[src] = 0;
        for(int i=0; i<n; i++)
        {
            dis[i] = (int)(1e9);
        }
        Queue<Triplet> q = new LinkedList<>();
        q.add(new Triplet(src,0,0));

        while(q.size()>0)
        {
            int nsrc = q.peek().src;
            int stop = q.peek().stop;
            int dist = q.peek().dis;
            q.remove();
            if(stop>k)
            {
                continue;
            }
            for(Pair p: adj.get(nsrc))
            {
                int nbrnode = p.f;
                int newdis = p.s;

                if(dist+newdis<dis[nbrnode] && stop<=k)
                {
                    dis[nbrnode] = dist + newdis;
                    q.add(new Triplet(nbrnode,stop+1,dist+newdis));
                }
            }
        }

        if(dis[dst]==(int)(1e9))
        return -1;

        return dis[dst];
    }
}
