package cyclicsort;

public class missing_number {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(MissingNumber(arr, 1));
    }
    
     static int missingNumber(int[] nums) {
      int i=0;
    
      while(i<nums.length)
      {
          int correctindex = nums[i];
         if(nums[i]<nums.length &&(nums[i]!=nums[correctindex]))
           {
               swap(i,correctindex,nums);
           }
           else{
               i++;
           }
      }
        
        for( i=0; i<nums.length; i++)
        {
            if(i!=nums[i])
            {
                return i;
            }
        }
        
        return nums.length;
    }
    
    static void swap(int x,int y,int[] nums)
    {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static int MissingNumber(int arr[], int n) {
        int i=0;
        while(i<arr.length)
        {
            int correctindex = arr[i]-1;
            
            if(arr[i]<=arr.length && arr[i]!=arr[correctindex])
            {
                swap(arr,i,correctindex);
            }
            else{
                i++;
            }
        }
        
        for(i=0; i<arr.length; i++)
        {
            if(arr[i]!=i+1)
            {
                return i+1;
            }
        }
        return arr.length+1;
     }
     
     public static void swap(int[]arr,int x,int y)
     {
         int temp = arr[x];
         arr[x] = arr[y];
         arr[y] = temp;
     }
}
