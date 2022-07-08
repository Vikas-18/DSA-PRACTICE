import java.util.ArrayList;

public class graph_representation {
    static class Edge{
        int src;
        int nbr;
        Edge(int src, int nbr)
        {
            this.src = src;
            this.nbr = nbr;
        }
    }
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Edge>>graph = new ArrayList<>();
        for (int i = 0; i <vertices; i++) {
            graph.add(new ArrayList<>());//adding arraylist infront of every index
        }
        graph.get(0).add(new Edge(0,1));
        graph.get(1).add(new Edge(1,0));
        
        graph.get(0).add(new Edge(0,3));
        graph.get(3).add(new Edge(3,0));
        
        graph.get(1).add(new Edge(1,2));
        graph.get(2).add(new Edge(2,1));
        
        graph.get(2).add(new Edge(2,3));
        graph.get(3).add(new Edge(3,2));
        
        graph.get(3).add(new Edge(3,4));
        graph.get(4).add(new Edge(4,3));
        
        graph.get(4).add(new Edge(4,5));
        graph.get(5).add(new Edge(5,4));
        
        graph.get(5).add(new Edge(5,6));
        graph.get(6).add(new Edge(6,5));
        
        graph.get(4).add(new Edge(4,6));
        graph.get(6).add(new Edge(6,4));

        
    }
}
