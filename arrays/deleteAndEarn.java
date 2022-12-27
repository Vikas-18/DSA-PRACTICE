import java.util.HashMap;
import java.util.Map;

public class deleteAndEarn {
    public static void main(String[] args) {
        int[]nums ={3,4,2};
        System.out.println(deleteAnDEarn(nums));
    }
    public static int deleteAnDEarn(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            int points = nums[i];
            for(Map.Entry<Integer,Integer> m : map.entrySet())
            {
                if(m.getKey()==nums[i]-1 || m.getKey()==nums[i]+1)
                {   
                    if(m.getValue()>1)
                    {
                        int cnt = 0;
                        while(cnt<m.getValue())
                        {
                            points+=m.getKey();
                            cnt++;
                        }
                    }
                    else
                    {
                        points+=m.getKey();
                    }
                }
            }
            ans = Math.max(ans,points);
        }
        return ans;
    }
}
