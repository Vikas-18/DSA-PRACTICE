/**
 * ratinamaze
 */
import java.util.ArrayList;
public class ratinamaze {
// {{1,0,0,1},
// {1,1,1,0},
// {1,1,1,1}}
    public static void main(String[] args) {
        int[][] maze={{1,1,0,1},
        {1,1,1,0},
        {1,1,1,1}};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        ways(maze, 0, 0,list,ans,visited);
       
        System.out.println(ans);


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