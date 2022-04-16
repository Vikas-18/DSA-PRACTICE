public class search2d {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(searchMatrix(arr, 10));
    }
   static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;
        
        while(r<matrix.length && c>=0)
        {
            if(matrix[r][c]==target)
            {
                 return true;
            }
            
            else if (matrix[r][c]<target)
            {
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}
