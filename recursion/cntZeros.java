public class cntZeros {
    public static void main(String[] args) {
        System.out.println(solve(1200309000));
    }
    public static int solve(int n)
    {
        if(n%10==n)
        {
            if(n%10==0)
            {
                return 1;
            }
            return 0;
        }
        int digit = n%10;
        int cnt = 0;
        if(digit==0)
        {
            cnt++;
        }
        int recAns = solve(n/10);
        return recAns + cnt;

    }
}
