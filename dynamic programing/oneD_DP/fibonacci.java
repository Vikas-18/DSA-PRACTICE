package oneD_DP;

public class fibonacci {
    public static void main(String[] args) {
        int n=45;

        int prev2 =0;
        int prev = 1;

        for (int i = 2; i <=n; i++) {
            int curi = prev2 + prev;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }

    
}
