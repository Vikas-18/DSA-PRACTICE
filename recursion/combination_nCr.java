import java.util.ArrayList;
import java.util.Arrays;

public class combination_nCr {
    public static void main(String[] args) {
        System.out.println(solve(5,2));
        ArrayList<Integer> res = new ArrayList<>();
        res.add(3);
        res.add(5);
        res.add(6);
        res.add(9);
        int[] ans = new int[res.size()];
        
        for(int i=0; i<ans.length; i++)
        {
            ans[0] = res.get(i);
        }

        System.out.println(Arrays.toString(ans));
        
     
    }

    static int solve(int n,int r)
    {
        if(n==r || r==0)
        {
            
            return 1;
        }

        int ans =  solve(n-1, r-1) + solve(n-1, r);
        return ans;
    }
}
