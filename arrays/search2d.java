


public class search2d {
    public static void main(String[] args) {
        int[][]arr = {{4,5,6},{7,0,1},{2}};
        System.out.println(searchMatrix(arr, 5));
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
    static boolean binarysearchMatrix(int[][] matrix, int target) {
        
        int l=0;
        int h= matrix.length-1;
        
        while(l<=h)
        {
           int mid = l+(h-l)/2;
 if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target)
            {
                //binary search
                int s=0;
                int e = matrix[0].length-1;
               
                while(s<=e)
                {
                   int middle = s+(e-s)/2;
                    if(matrix[mid][middle]==target)
                    {
                        return true;
                    }
                    
                    else if(matrix[mid][middle]>target)
                    {
                        e = middle-1;
                    }
                    
                    else{
                        s = middle+1;
                    }
                }
               return false;
            }
            
else if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]<=target)
            {
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return false;
    } 
}