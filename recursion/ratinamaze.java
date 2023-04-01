/**
 * ratinamaze
 */
import java.util.ArrayList;
public class ratinamaze {
// {{1,0,0,1},
// {1,1,1,0},
// {1,1,1,1}}
    public static void main(String[] args) {
        int[][] maze={{1,1,1},
                      {1,1,1},
                      {1,1,1}};
        boolean[][] vis = new boolean[maze.length][maze[0].length];
        ArrayList<String> ans = new ArrayList<>();
        printPath(maze, 0, 0, vis, ans);
        System.out.println(waysCount(maze, 0, 0, vis));;

        // ArrayList<String> list = new ArrayList<>();
        // ArrayList<ArrayList<String>> ans = new ArrayList<>();
        // boolean[][] visited = new boolean[maze.length][maze[0].length];
        // ways(maze, 0, 0,list,ans,visited);
       
        // System.out.println(ans);


    }
    // up down left right
    public static int waysCount(int[][]arr,int r,int c,boolean[][]vis)
    {
        if(r==arr.length-1 && c==arr.length-1)
        {
            return 1;
        }
        if(r<0 || r>=arr.length || c<0 || c>=arr[0].length)
        {
            return 0;
        }

        int up = 0;
        if(vis[r][c]==false && arr[r][c]==1)
        {
            vis[r][c] = true;
           up = waysCount(arr, r-1, c,vis);
           vis[r][c] = false;
        }
        int down = 0;
        if(vis[r][c]==false && arr[r][c]==1)
        {
            vis[r][c] = true;
          down = waysCount(arr, r+1, c,vis);
          vis[r][c] = false;
        }
        int left = 0;
        if(vis[r][c]==false && arr[r][c]==1)
        {
            vis[r][c] = true;
           left = waysCount(arr, r, c-1,vis);
           vis[r][c] = false;
        }
        int right = 0;
        if(vis[r][c]==false && arr[r][c]==1)
        {
            vis[r][c] = true;
           right= waysCount(arr, r, c+1,vis);
           vis[r][c] = false;
        }

        return up+down+left+right;
    }

    static void printPath(int[][]arr,int r,int c,boolean[][]vis,ArrayList<String> ans)
    {
        if(r==arr.length-1 && c==arr[0].length-1)
        {
            System.out.println(ans);
            return;
        }
        if(r<0 || r>=arr.length || c<0 || c>=arr[0].length)
        {
            return;
        }
        
        if(vis[r][c]==false)
        {
           vis[r][c] = true;
           ans.add("U");
           printPath(arr, r-1, c, vis, ans);
           ans.remove(ans.size()-1);
           vis[r][c] = false;
        }
        if(vis[r][c]==false)
        {
            vis[r][c] = true;
            ans.add("D");
            printPath(arr, r+1, c, vis, ans);
           ans.remove(ans.size()-1);
            vis[r][c] = false;
        }
   
        if(vis[r][c]==false)
        {
            vis[r][c] = true;
            ans.add("L");
            printPath(arr, r, c-1, vis, ans);
           ans.remove(ans.size()-1);
            vis[r][c] = false;
        }
      
        if(vis[r][c]==false)
        {
           vis[r][c] = true;
           ans.add("R");
           printPath(arr, r, c+1, vis, ans);
           ans.remove(ans.size()-1);
           vis[r][c] = false;
        }

        
    }

    static void ways(int[][] maze,int n,int m ,ArrayList<String> list,ArrayList<ArrayList<String>> ans,boolean[][] visited)
    {

        if(n==maze.length-1 && m==maze[0].length-1)
        {
           ans.add(new ArrayList<>(list));
          
            return;
        }

        if( n+1<maze.length && !visited[n+1][m] && maze[n+1][m]==1)
        {
            visited[n][m]=true;
            list.add("D");
            ways(maze,n+1,m,list,ans,visited);
            list.remove(list.size()-1);
            visited[n][m]=false;
        }

  if(n-1>=0 && !visited[n-1][m] && maze[n-1][m]==1)
        {
            visited[n][m]=true;
            list.add("U");
            ways(maze,n-1,m,list,ans,visited);
            list.remove(list.size()-1);
            visited[n][m]=false;
        }
        if ( m+1<maze[0].length && !visited[n][m+1] &&maze[n][m+1]==1) {
            visited[n][m]=true;
            list.add("R");
            ways(maze,n,m+1,list,ans,visited);
            list.remove(list.size()-1);
             visited[n][m]=false;
        }

      

        if(m-1>=0 && !visited[n][m-1] && maze[n][m-1]==1)
        {
             visited[n][m]=true;
            list.add("L");
            ways(maze,n,m-1,list,ans,visited);
            list.remove(list.size()-1);
             visited[n][m]=false;
        }




    }
}