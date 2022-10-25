import java.util.HashSet;

public class distictelementsafterReversing {
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }
    public static int countDistinctIntegers(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i] = reverse(nums[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
         for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }
   
    public static int reverse(int n)
    {
        int ans =0;
        while(n>0)
        {
            int lastdigit = n%10;
            ans = ans*10 + lastdigit;
            n = n/10;
        }
        return ans;
    }
}
