
import java.util.*;
public class subset2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr  = {1,2,2};
        subset(0, arr, list, ans);
        System.out.println(ans);
    }
    static void subset(int idx,int[] arr,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans)
    {

        ans.add(new ArrayList<>(list));
        for (int i = idx; i < arr.length; i++) {
            if(i!=idx && arr[i]==arr[i-1])
            continue;
            list.add(arr[i]);
            subset(i+1, arr, list, ans);
            list.remove(list.size()-1);
        }
    }
}
