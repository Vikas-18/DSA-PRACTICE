import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class distinctAvg {
    public static void main(String[] args) {
        int[]nums = {9,5,7,8,7,9,8,2,0,7};
        System.out.println(distinctAverages(nums));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0; 
        int j=nums.length-1;
        double avg = 0;
        Set<Double> set = new HashSet<>();
        while(i<j)
        {
          avg = ((double)nums[i] + (double)nums[j])/2;
          set.add(avg);
          i++;
          j--;
        }
        return set.size();
    }
}
