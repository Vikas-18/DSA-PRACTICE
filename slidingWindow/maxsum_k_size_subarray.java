public class maxsum_k_size_subarray {
    public static void main(String[] args) {
        int[]arr = {2,2,3,5,6,7};

        int i= 0;//start of the window
        int j= 0;//end of the window
        int k=3;//size of the subarray
        
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        while(j<arr.length)
        {
          sum+=arr[j];

          if(j-i+1<k)//j-i+1-> window size
          {
            j++;
          }

          else if(j-i+1==k)
          {
            maxsum = Math.max(maxsum, sum);
            sum = sum-arr[i];//sliding condition 
            i++;
            j++;
          }
        }

        System.out.println(maxsum);

    }
}
