import java.util.HashSet;
import java.util.Set;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class increasingSubs {
    public static void main(String[] args) {
        int[] nums  ={4,6,7,7};
        System.out.println(findSubsequences(nums));
    }
    public static ArrayList<ArrayList<Integer>> findSubsequences(int[] nums) {
        Set<ArrayList<Integer>> ans = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        solve(nums,0,-1,list,ans);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(ans);
        return new ArrayList(ans);
        
    }
    public static void solve(int[]nums,int idx,int prev,ArrayList<Integer> list,Set<ArrayList<Integer>> ans)
    {
        //base case
        if(idx>=nums.length)
        {
            if(list.size()>=2)
            ans.add(new ArrayList<>(list));
            return;
        }

      

        //picking up a element
        if(prev==-1 || nums[idx]>=nums[prev])
        {
            list.add(nums[idx]);
            solve(nums,idx+1,idx,list,ans);
            list.remove(list.size()-1);
        }
          //not picking up a element
        solve(nums,idx+1,prev,list,ans);
    }
}
