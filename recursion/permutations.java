/**
 * permutations
 */
import java.util.*;
public class permutations {

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        List<Integer> ans = new ArrayList<>();
        boolean[] f = new boolean[arr.length];
        List<List<Integer>> list = new ArrayList<>();
        permute2(arr, f, ans,list);
        System.out.println(list);
    }

    static void permute(int[] arr,boolean[] f,List<Integer> ans,List<List<Integer>> list)
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
    static void permute2(int[] arr,boolean[] f,List<Integer> ans,List<List<Integer>> list)
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