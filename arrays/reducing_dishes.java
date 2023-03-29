import java.util.Arrays;

public class reducing_dishes {
    public static void main(String[] args) {
        int[] satisfaction  ={-1,-8,0,5,-9};
        System.out.println(maxSatisfaction(satisfaction));
    }
    public static int maxSatisfaction(int[] satisfaction) {
        
        Arrays.sort(satisfaction);
        int res =0;
        int total = 0;

        for(int i=satisfaction.length-1; i>=0 && satisfaction[i]+total>0; i--)
        {
            total += satisfaction[i];
            res+=total;
        }
        return res;
    }
}
