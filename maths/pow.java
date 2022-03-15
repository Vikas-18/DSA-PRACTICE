

public class pow {

public static void main(String[] args) {
     System.out.println(power(-1,1,20));
}
  static int power(int x, int n, int d) {
        int ans=x;
        int i=x;
        for(int j=1; j<n; j++)
        {
            ans = ans*i;
        }
        if(n==0)
        {
            return 1%d;
        }
        if(ans<0)
        {
            return Math.abs(Math.abs(d) - Math.abs(ans));
        }
        return ans%d;
    }
}
