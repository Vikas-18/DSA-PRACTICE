package arrays;

import java.util.Arrays;

public class median_2darr {
    public static void main(String[] args) {
        int[][] M = {{10,20,30,40}, 
        {15,25,35,45}, 
        {27,29,37,48}
    ,{32,33,39,50}};
        System.out.println(sortedMatrix(4, M));
    }
   public static int median(int matrix[][], int r, int c) {
        int[] arr = new int[r*c];
        int k=0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr[k] = matrix[i][j];
                k++;
            }
        }
        
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    public static int[][] sortedMatrix(int n, int matrix[][]) {
        int[] arr = new int[n*n];
        int k=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[k] = matrix[i][j];
                k++;
            }
        }
        
        Arrays.sort(arr);
        k=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j]=arr[k];
                k++;
            }
        }
        
        return matrix;
    }
}
