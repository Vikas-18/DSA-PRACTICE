import java.util.Arrays;
import java.util.HashMap;

public class maxDestroy {
    public static void main(String[] args) {
        int[]nums = {3,7,8,1,1,5};
        int space = 2;
        System.out.println(destroyTargets(nums, space));
    }
    public static int destroyTargets(int[] nums, int space) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],1);
        }
        Arrays.sort(nums);
        int ans = -1;
        int res = 0;
        for(int i=0; i<nums.length; i++)
        {
            int cnt = 0;
            int c=1;
            while(nums[i]+c*space<=nums[nums.length-1])
            {
                if(map.containsKey(nums[i]+c*space))
                {
                    c++;
                    cnt++;
                }
            }
            if(cnt>res)
            {
                res = cnt;
                ans = nums[i];
            }
        }
        return ans;
    }
}
