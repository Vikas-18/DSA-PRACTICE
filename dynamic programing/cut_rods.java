import java.util.ArrayList;

public class cut_rods {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        solve(arr, 7, 0, 0, list, ans);
        System.out.println(res);
        

    }
    public static int res = 0;
    public static void solve(int[] arr,int target,int sum,int idx,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans)
    {
        //base case
        if(idx>=arr.length)
        {
           
            if(target==0)
            {
                res = Math.max(res,list.size());
                ans.add(new ArrayList<>(list));
            }
            return;
        }

       
        if(target>=arr[idx])
        {
            list.add(arr[idx]);
            solve(arr, target-arr[idx], sum, idx,list,ans);
            list.remove(list.size()-1);
        }
        
        solve(arr, target, sum, idx+1,list,ans);

        
    }
    
    
}
