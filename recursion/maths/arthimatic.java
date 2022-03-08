package maths;

public class arthimatic {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        System.out.println(numberOfArithmeticSlices(nums));
    }
    
    static int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length<3)
        {
            return 0;
        }
        int ans= 0;
       for(int i=0; i<nums.length-1; i++)
       {
           int count=0;
           int diff = nums[i+1]-nums[i];
           for(int j=i+1; j<nums.length; j++)
           {
               if(nums[j]-nums[j-1]==diff)
               {
                   count++;
               }
               
               if(j==nums.length-1 && count>=2)
               {
                   ans++;
               }          
                   
           }
       }
        return ans;
     
    }
}
