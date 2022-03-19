/**
 * selection_sort
 */
public class selection_sort {

    public static void main(String[] args) {
        
        int [] arr = {4,3,0,1,2};
        
       for (int i = 0; i < arr.length-1; i++) {
           for (int j = i; j < arr.length; j++) {
               if(arr[i]>arr[j])
               {
                  swap(i, j, arr);
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