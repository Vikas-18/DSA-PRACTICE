/**
 * combinationsum
 */
import java.util.*;
public class combinationsum {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        csum(0, arr, 3, 0, ans);
    }

    static void csum(int idx,int[] arr,int target,int sum,ArrayList<Integer> ans)
    {
        if(idx>=arr.length)
        {
            if(sum==target)
            {
                System.out.println(ans);
                return;
            }
            else{
                return;
            }
        }

        ans.add(arr[idx]);
        sum+=arr[idx];
        csum(idx+1,arr,target,sum,ans);
        sum-=arr[idx];
        ans.remove(ans.size()-1);
        csum(idx+1, arr, target, sum, ans);



    }
}