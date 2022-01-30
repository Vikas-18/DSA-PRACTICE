import java.util.*;


public class leetcodecombiantionsum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        combination(0, 7, arr, ans,list);
        System.out.println(list);
    }

    static void  combination(int idx,int target,int[] arr, ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> list)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                list.add(new ArrayList<>(ans));
                return;
            }
            else
            return;
        }

        
        if(target>=arr[idx])
        {
        ans.add(arr[idx]);
        combination(idx, target-arr[idx], arr,ans,list);
        ans.remove(ans.size()-1);
        }
        combination(idx+1, target, arr, ans,list);



    }
}
