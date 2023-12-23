import java.util.LinkedList;
import java.util.Queue;

/**
 * bipartite
 */
public class bipartite {

    public static void main(String args[]) {
        int[][] graph = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };
        System.out.println(isBipartite(graph));
    }

    public static boolean isBipartite(int[][] arr) {

        boolean[] vis = new boolean[arr.length];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));
        int[] color = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            color[i] = -1;
        }
        color[0] = 0;
        vis[0] = true;

        while (q.isEmpty() == false) {
            int col = q.peek().s;
            int node = q.peek().f;
            q.poll();

            for (Integer it : arr[node]) {
                if (vis[it] == false) {
                    vis[it] = true;
                    if (col == 0)
                        q.add(new Pair(it, 1));
                    else if (col == 1)
                        q.add(new Pair(it, 0));

                } else {
                    if (color[it] == col)
                        return false;
                }
            }
        }
        return true;
    }

    public static class Pair {
        int f;
        int s;

        Pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }

}