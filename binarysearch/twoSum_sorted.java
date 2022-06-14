import java.util.Arrays;

/**
 * 2_sum_sorted
 */
public class twoSum_sorted {

    public static void main(String[] args) {
        int[] numbers = {0,0,3,4};
        System.out.println(Arrays.toString(twoSum(numbers, 0)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        
        for(int i=0; i<numbers.length; i++)
        {
            if(ans[0]!=ans[1])
            {
               break;
            }
            int newTarget = target - numbers[i];
            ans[0] = i+1;
            int l=0;
            int h = numbers.length;
            
            while(l<=h)
            {
                int mid = l+(h-l)/2;
                if(numbers[mid]==newTarget)
                {
                    ans[1]=mid+1;
                    if(ans[0]==ans[1])
                    {
                       
                    }
                    if(ans[0]!=ans[1])
                    {
                       break;
                    }
                }
                else if(numbers[mid]>newTarget)
                {
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
        }
      
        return ans;
    }
}