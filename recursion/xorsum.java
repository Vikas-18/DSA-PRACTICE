import java.util.*;
public class xorsum {
    static int maxxorsum=0;
    public static void main(String[] args) {
        int[] arr= {5,1,6};
        int maxsum=0;
        xor(0, arr, 0, maxsum);
      
    }
    static void xor(int idx,int[] arr,int sum,int maxsum)
    {
        if (idx==arr.length) {
            maxsum+=sum;
            maxxorsum+=maxsum;
            if(maxsum==0)
            {
                System.out.println(maxxorsum);
            }
           
            return;
        }

       
        xor(idx+1, arr, sum^arr[idx], maxsum);
        xor(idx+1, arr, sum, maxsum);
        
    }
}
