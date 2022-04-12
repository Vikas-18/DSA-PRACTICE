import java.util.Arrays;

public class rotatearraybyone {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<=e)
        {
            swap(s,e,arr);
            s++;
        }
    }
    static void swap(int x,int y,int[] arr)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
