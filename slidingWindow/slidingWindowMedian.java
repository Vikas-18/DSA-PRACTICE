import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class slidingWindowMedian {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int k=4;
        System.out.println(Arrays.toString(medianSlidingWindow(arr, k)));

    }
    public static double[] medianSlidingWindow(int[] nums, int k) {
        int i=0;
        int j=0;
        int idx = 0;
        double[] ans = new double[nums.length-k+1];
  

        while(j<nums.length)
        {
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                ArrayList<Double> list = new ArrayList<>();
                for (int l = i; l <=j; l++) {
                    list.add((double)(nums[l]));
                }
                ans[idx] = median(list);
                i++;
                j++;
                idx++;
            }
        }
        return ans;
    }

    public static double median(ArrayList<Double> arr)
    {
        Collections.sort(arr);
        if(arr.size()%2!=0)
        {
            return arr.get(arr.size()/2);
        }
  
        return (arr.get(arr.size()/2-1) + arr.get(arr.size()/2))/2;
    }

}
