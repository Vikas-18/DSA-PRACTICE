public class merge_sort {
    public static void main(String[] args) {

        int[] arr = {1,2,};
      
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void mergesort(int[] arr,int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid = s+e/2;
        

        mergesort(arr, s, mid);
        mergesort(arr, mid+1, e);

        int[] ans = new int[arr.length];

        ans = merge(arr,s,e);
       
        
    }

    static int[] merge(int[] arr,int s,int e)
    {
        int mid = s+e/2;
      int len1 = mid-s+1;
      int len2 = e-mid;

      int[] arr1 = new int[len1];
      int[] arr2 = new int[len2];

      int k=s;
      for (int i = 0; i <len1; i++) {
          arr1[i]=arr[k];
          k++;
      }
      k=mid+1;
      for (int i = 0; i < len2; i++) {
          arr2[i] = arr[k];
          k++;
      }

      int i=0;
      int j=0;
      k=0;

      while(i<len1 && j<len2)
      {
          if(arr1[i]<arr2[j])
          {
              
          }
      }
    }
}
