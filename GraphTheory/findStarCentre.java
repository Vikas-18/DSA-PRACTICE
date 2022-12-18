public class findStarCentre {
    public static void main(String[] args) {
        int[][]edges = {{1,2},{2,3},{4,2}};
        System.out.println(findCenter(edges));
    }
    public static int findCenter(int[][] edges) {
        int n = edges.length;
        int[]indegree = new int[n+2];
        for(int i=0; i<edges.length; i++)
        {
            indegree[edges[i][1]]++;
            indegree[edges[i][0]]++;
        }
        for(int i=0; i<indegree.length; i++)
        {
            if(indegree[i]==n)
            return i;
        }
        return -1;

    }
}
