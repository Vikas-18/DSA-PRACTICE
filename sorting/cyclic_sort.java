/**
 * cyclic_sort
 */
public class cyclic_sort {

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};

        for (int i = 0; i < arr.length; i++) {
            int correctindex = arr[i] - 1;
            if(arr[i]!=arr[correctindex])
            {
                swap(i,correctindex,arr);
            }
        }
        // for(int i=0; i<arr.length; i++)
        // {
        //     int correctvalue = i+1;
        //     if(arr[i]!=correctvalue)
        //     {
        //         System.out.println(arr[i]);
        //     }
        // }
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

