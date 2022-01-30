import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        subs(0, arr, ans);
    }

    static void subs(int idx,int[] arr,ArrayList<Integer> ans)
    {
        if(idx>=arr.length)
        {
            System.out.println(ans);
            return;
        }
        ans.add(arr[idx]);
        subs(idx+1, arr, ans);
        ans.remove(ans.size()-1);
        subs(idx+1, arr, ans);
    }
}
