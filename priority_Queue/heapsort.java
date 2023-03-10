import java.util.Arrays;
public class heapsort {
    public static void heapify(int[] arr,int i,int n)
    {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left<arr.length && arr[left]>arr[i])
        {
            maxIdx = left;
        }
        if(right<arr.length && arr[right]>arr[i])
        {
            maxIdx = right;
        }

        if(maxIdx!=i)
        {
            //swap
            int temp = arr[i];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, n);
        }

    }
    public static void heapSort(int arr[])
    {
        int n = arr.length;
        //maxheap banao
        for(int i=n/2; i>=0; i--)
        {
            heapify(arr,i,n);
        }

        //swap first-greatest and last
        for (int i = n-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,6};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
