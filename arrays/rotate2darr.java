package arrays;

public class rotate2darr {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
        rotate(arr);
        System.out.println("After");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }
    }
   
       static void rotate(int[][] arr) {
            
            //taking transpose
            for(int i=0; i<arr.length; i++)
            {
              for(int j=i; j<arr[0].length; j++)
              {
                 int temp = arr[i][j];
                  arr[i][j] = arr[j][i];
                  arr[j][i] = temp;
              }
            }
            // swapping each columns
            for(int i=0; i<arr.length; i++)
            {
                
                int l =0;
                int r = arr[0].length-1;
                
                while(l<r)
                {
                    int temp = arr[i][l];
                   arr[i][l] = arr[i][r];
                    arr[i][r] = temp;
                    l++;
                    r--;
                }
            }
    }
}
