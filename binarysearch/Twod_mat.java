public class Twod_mat {
    public static void main(String[] args) {
        int[][]mat = {{1},{3}};
            System.out.println(matSearch(mat, 2, 1, 3));
    }

    public static int matSearch(int mat[][], int N, int M, int X)
    {
       int i =0;
       int j = M-1;
       
       while(i<N)
       {
           if(mat[i][0]<=X && mat[i][j]>=X)
           {
               return binarysearch(i,j,mat,X);
           }
           else if(mat[i][0]>X)
           {
               return 0;
           }
           else if(mat[i][j]<X)
           {
               i++;
           }
       }
       return 0;
    }
    public static int binarysearch(int s,int e,int[][]arr,int t)
    {
        int row = s;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(arr[row][mid]==t)
            {
                return 1;
            }
            
            else if(arr[row][mid]<t)
            {
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        
        return 0;
    }
}
