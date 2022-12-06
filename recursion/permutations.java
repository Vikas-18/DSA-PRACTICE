/**
 * permutations
 */
import java.util.ArrayList;
public class permutations {

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] f = new boolean[arr.length];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        permute2(arr, f, ans,list);
        System.out.println(list);
    }

    static void permute(int[] arr,boolean[] f,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> list)
    {
        if(ans.size()==arr.length)
      list.add(new ArrayList<>(ans));

        for (int i = 0; i < arr.length; i++) {
            if(!f[i])
            {
               
                f[i]=true;
                 ans.add(arr[i]);
                 permute(arr, f, ans,list);
                 f[i]=false;
                 ans.remove(ans.size()-1);

            }
        }
    }
    static void permute2(int[] arr,boolean[] f,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> list)
    {
        if(ans.size()==arr.length)
      list.add(new ArrayList<>(ans));

        for (int i = 0; i < arr.length; i++) {
            if(f[i] || (i>0 && arr[i]==arr[i-1])&&!f[i])
            {
                continue;

            }

               if(!f[i])
               {
                f[i]=true;
                 ans.add(arr[i]);
                 permute(arr, f, ans,list);
                 f[i]=false;
                 ans.remove(ans.size()-1);
              }

            
        }
    }
}