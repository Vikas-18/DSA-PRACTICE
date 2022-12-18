/**
 * combinationsum
 */
import java.util.ArrayList;
public class combinationsum {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        csum(0, arr, 3, 0, ans);
        System.out.println(list);
        System.out.println((int)('1'));
    }
public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    static void csum(int idx,int[] arr,int target,int sum,ArrayList<Integer> ans)
    {
        if(idx>=arr.length)
        {
            if(sum==target)
            {
               list.add(new ArrayList<>(ans));
            }
            
                return;
            
        }

        ans.add(arr[idx]);
        sum+=arr[idx];
        csum(idx+1,arr,target,sum,ans);
        sum-=arr[idx];
        ans.remove(ans.size()-1);
        csum(idx+1, arr, target, sum, ans);



    }
}