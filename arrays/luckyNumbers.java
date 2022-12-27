import java.util.ArrayList;
import java.util.HashMap;
public class luckyNumbers {
    public static void main(String[] args) {
        int[][]matrix = {{1,10,4,2},
                        {9,3,8,7},
                        {15,16,17,12}};
        System.out.println(luckyNumber(matrix));
    }
    public static ArrayList<Integer> luckyNumber (int[][] matrix) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx = 0;
        for(int i=0; i<matrix.length; i++)
        {
            int minrow = (int)(1e9);
            for(int j=0; j<matrix[0].length; j++)
            {
                minrow = Math.min(minrow,matrix[i][j]);
            }
            map.put(minrow, 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<matrix[0].length; i++)
        {
            int maxcol = 0;
            for(int j=0; j<matrix.length; j++)
            {
                maxcol = Math.max(maxcol,matrix[j][i]);
            }
            if(map.containsKey(maxcol))
            {
               ans.add(maxcol);
            }
        }
       
    
        return ans;
        // 3 7 8
        // 9 11 13
        // 15 16 17
    }
}
