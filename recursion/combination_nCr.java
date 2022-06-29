
public class Combination_nCr {
    public static void main(String[] args) {
        System.out.println(solve(5,2));
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
