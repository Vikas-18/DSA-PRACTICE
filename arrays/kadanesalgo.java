public class kadanesalgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,3,-5,7,8};
        System.out.println(maxSubarraySum(arr));
    }
   static  int maxSubarraySum(int arr[]){
        
        int csum = arr[0];
        int maxsum = arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            if(csum>=0)//add arr[i] only when csum is positive/0
            {
                csum+=arr[i];
            }
            else{
                csum = arr[i];//starts a new chain
            }
            if(csum>maxsum)
            {
                maxsum = csum;//check if csum max or not
            }
        }
        return maxsum;
        
    }
}
