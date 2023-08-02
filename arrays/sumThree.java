import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sumThree {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 0 };
        System.out.println(threeSum(nums));
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        Set<ArrayList<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            int s = i + 1;
            int e = nums.length - 1;
            while (s < e) {
                int currsum = nums[i] + nums[s] + nums[e];

                if (currsum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[s]);
                    list.add(nums[e]);
                    ans.add(new ArrayList<>(list));
                    i = i + 1;
                    break;
                }

                else if (currsum < 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
