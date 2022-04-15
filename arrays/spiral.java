
import java.util.*;
public class spiral {
 
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        ArrayList<Integer> ans = new ArrayList<>();
       ans = spiralOrder2(matrix);
       System.out.println(ans);
    }
    static ArrayList<Integer> spiralOrder(int[][] matrix) {
        
     ArrayList<Integer> ans = new ArrayList<>();
        
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        
        int tne = (matrix.length)*(matrix[0].length);
        int cnt = 0;
        
        while(cnt<tne)
        {
            //left
            for(int i=minr,j=minc; i<=maxr && cnt<tne; i++)
            { 
               ans.add(matrix[i][j]);
               cnt++;
            }
            minc++;
            
            //bottom
              for(int i=maxr,j=minc; j<=maxc && cnt<tne; j++)
            { 
               ans.add(matrix[i][j]);
               cnt++;
            }
            maxr--;
            
            //right
              for(int i=maxr,j=maxc; i>=minr && cnt<tne; i--)
            { 
               ans.add(matrix[i][j]);
               cnt++;
            }
            maxc--;
            
            //top
              for(int i=minr,j=maxc; j>=minc&& cnt<tne; j--)
            { 
               ans.add(matrix[i][j]);
               cnt++;
            }
            minr++;
        }
        
        return ans;
    }
    static ArrayList<Integer> spiralOrder2(int[][] matrix) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        
        int tne = (matrix.length)*(matrix[0].length);
        int cnt = 0;
        
        while(cnt<tne)
        {
            
             //left->right
              for(int i=minr,j=minc; j<=maxc&& cnt<tne; j++)
            { 
               ans.add(matrix[i][j]);
                  cnt++;
            }
            minr++;
              //top-bottom
              for(int i=minr,j=maxc; i<=maxr && cnt<tne; i++)
            { 
               ans.add(matrix[i][j]);
                  cnt++;
            }
            maxc--;
             
             //left to right
             for(int i=maxr,j=maxc; j>=minc && cnt<tne; j--)
             { 
                ans.add(matrix[i][j]);
                 cnt++;
             }
             maxr--;

           // up
              for(int i=maxr,j=minc; i>=minr && cnt<tne; i--)
            { 
               ans.add(matrix[i][j]);
               cnt++;
            }
            minc++;
           
           
        }
        
        return ans;
    }
}
