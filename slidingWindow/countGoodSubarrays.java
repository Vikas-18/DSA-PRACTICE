import java.util.HashSet;
import java.util.Set;

public class countGoodSubarrays {
    public static void main(String[] args) {
        int[]A = {1, 2, 1, 2, 3};
        int k=2;
        System.out.println(solve(A, k));
    }
    public static int solve(int[] A, int k) {
        int i=0;
        int j=0;
        int ans=0;
        Set<Integer> set = new HashSet<>();
        while(j<A.length && i<A.length)
        {
            set.add(A[j]);
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k || set.size()==k)
            {
                if(set.size()==k)
                {
                    ans++;
                }
                else
                {
                    set.remove(i);
                    i++;
                }
                j++;
            }
            else if(set.size()>k)
            {
                set.remove(i);
                i++;
                j++;
            }
        }
        return ans;
    }
}
