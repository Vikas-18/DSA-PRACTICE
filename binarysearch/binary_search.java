public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int t = 4;

        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;

            if(arr[mid]==t)
            {
                 System.out.println(mid);
                 break;
            }

            else if(arr[mid]>t)
            {
                e = mid - 1;
            }

            else{
                s = mid + 1;
            }
        }
        System.out.println(-1);

    }
}
