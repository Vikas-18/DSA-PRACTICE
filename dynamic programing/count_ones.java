public class count_ones {
    public static void main(String[] args) {
        int n = 13;
        int[] dp = new int[n+1];
       System.out.println(solve(n, dp));
    }

    
     static int solve(int n,int[]qb)
    {
        if(n==1 || n==0)
        {
            return n;
        }
    
        int temp = n;
        int ownans  = 0;
        while(temp>0)
        {
            int lastdigit = temp%10;
            if(lastdigit==1)
            {
                ownans++;
            }
            temp = temp/10;
        }
        int rans = solve(n-1,qb);
       
        return rans + ownans;
        
    }
}
