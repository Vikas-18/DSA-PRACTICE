public class bubble_sort {

    public static void main(String[] args) {
        //worst case: O(n*n) best case:O(n); 
        int [] arr = {0,1,3,1,3,-2}; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])//compare side by side & swap
                {
                   swap(j,j+1,arr);
                }
              
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
   static void swap(int x,int y,int[] arr)
    {
         int temp = arr[x];
         arr[x] = arr[y];
         arr[y] = temp;
    }
}
