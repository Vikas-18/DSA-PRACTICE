/**
 * cyclic_sort
 */
public class cyclic_sort {

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,6,8,4};

        cyclicsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void cyclicsort(int[] arr)
    {
        int i=0;
        
        while(i<arr.length)
        {
            int correctindex = arr[i] -1;
            if(arr[i]!=arr[correctindex])
            {
                swap(i,correctindex,arr);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int x,int y,int[] arr)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

