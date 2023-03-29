package cyclicsort;

public class missingpositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive3(nums));
    }
    public static int firstMissingPositive3(int[] nums) {
        int idx =0;
        while(idx<nums.length)
        {
            int correctidx = nums[idx]-1;
            if(correctidx>=0 && correctidx<nums.length && nums[idx]!=nums[correctidx])
            {
                swap(nums,idx,correctidx);
            }
            else
            {
                idx++;
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return nums.length+1;
    }
    // public static void swap(int[]nums,int i,int j)
    // {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }
      static int firstMissingPositive(int[] nums) {
           int i=0;
        while(i<nums.length)
      {
          int correctindex = nums[i]-1;
         if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correctindex])
           {
               swap(i,correctindex,nums);
           }
          
           else{
               i++;
           }

      }

         for( i=0; i<nums.length; i++)
        {
            if(i+1!=nums[i])
            {
                return i+1;
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

    public static int firstMissingPositive2(int[] arr) {
        
        int i=0;
        
        while(i<arr.length)
        {
            int correctindex = arr[i];
            
            if(arr[i]>=0 && arr[i]<arr.length && arr[correctindex] !=arr[i])
            {
                swap(arr,correctindex,i);
            }
            else{
                i++;
            }
        }
        
        for(i=0; i<arr.length; i++)
        {
            if(i!=arr[i])
            {
                return i;
            }
        }
        return arr.length;
    }
    public static void swap(int[]arr,int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
    


