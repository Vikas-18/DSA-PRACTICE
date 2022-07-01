package arrays;

public class productofarray {
    public static void main(String[] args) {
        
    }

   static int[] productExceptSelf(int[] nums) {
        //right array banao which contains product afterwards
        int[] right = new int[nums.length];
        int mult = 1;
        for(int i = nums.length-1; i>=0; i--)
        {
           mult*=nums[i];
            right[i] = mult;
        }
        //left array jaise kaam karega contains product from start till that element
        mult = 1;
        int[] ans = new int[nums.length];
        
        for(int i=0; i<nums.length-1; i++)
        {
        
            int rightproduct = right[i+1];
            
            ans[i] = mult*rightproduct;
            mult*=nums[i];
        }
        ans[ans.length-1] = mult;
        return ans;
    }

}
