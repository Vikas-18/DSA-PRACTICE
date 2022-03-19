public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {6,7,4,5,3};
        int length = 5;

        System.out.println("Before Sorting");

        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr , 0 , length - 1);
        System.out.println("After Sorting");
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr , int s , int e){
        //base case
        if(s >= e)
            return;

        int mid = (s + e)/2;
        //left Part
        mergeSort(arr , s , mid);
        //right part
        mergeSort(arr , mid + 1 , e);
        merge(arr , s , e);
    }

    public static void merge(int[] arr , int s , int e){

        int mid = (s + e)/2;
        int len1 = mid - s + 1; //length of first half
        int len2 = e - mid; //length of second half
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        //copy elements in these arrays;
        int originalArrayIndex = s;
        for(int i = 0; i < len1; i++){
            arr1[i] = arr[originalArrayIndex++];
        }

       originalArrayIndex = mid + 1;

        for(int i = 0; i < len2; i++){
            arr2[i] = arr[originalArrayIndex++];
        }

        //merge two sorted arrays;
        originalArrayIndex = s;

        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < len1 && idx2 < len2){
            if(arr1[idx1] < arr2[idx2]){
                arr[originalArrayIndex++] = arr1[idx1++];
            }
            else {
                arr[originalArrayIndex++] = arr2[idx2++];
            }
        }

        //if in arr1 elements are remaining
        while(idx1 < len1){
            arr[originalArrayIndex++] = arr1[idx1++];
        }
        //if in arr2 elements are remaining
        while(idx2 < len2){
            arr[originalArrayIndex++] = arr2[idx2++];
        }
    }
}