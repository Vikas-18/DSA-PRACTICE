public class subarray_minimums {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        int min = (int)1e9;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
               min= Math.min(min,arr[j]);
               sum+=min;
            }
            min = (int)1e9;
        }
        return sum%(int)1e9+7;
    }
}
