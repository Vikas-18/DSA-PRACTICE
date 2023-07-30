import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class foursum {
    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        Arrays.sort(nums);
        System.out.println(fourSum(nums, target));
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (map.containsKey(target - nums[i] - nums[j] - nums[k])) {
                        ArrayList<Integer> list = new ArrayList<>();
                        if (map.get(target - nums[i] - nums[j] - nums[k]) != i
                                && map.get(target - nums[i] - nums[j] - nums[k]) != j
                                && map.get(target - nums[i] - nums[j] - nums[k]) != k) {
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(target - nums[i] - nums[j] - nums[k]);
                            ans.add(new ArrayList<>(list));
                        }
                    }
                }
            }
        }
        return ans;
    }
}