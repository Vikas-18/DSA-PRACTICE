import java.util.*;
public class addnumbers {
    public static void main(String[] args) {
        int[] A = {4, 3, 6, 7, 9, 9, 1, 7, 8};
        int[] B = { 7, 5, 8, 9};

        System.out.println(Arrays.toString(addArrays(A, B)));
    }
    static int[] addArrays(int[] A, int[] B) {

        List<Integer> ans = new ArrayList<Integer>();

        int i=A.length-1;
        int j=B.length-1;
        int carry = 0;
        int sum =0;

        while(i>=0 && j>=0)
        {
            sum =(A[i]+B[j])+carry;
            int lastdigit = sum%10;
            ans.add(lastdigit);
            carry = sum/10;
            i--;
            j--;
        }
        while(i>=0)
        {
          sum = (A[i])+carry;
            int lastdigit = sum%10;
            ans.add(lastdigit);
            carry = sum/10;
            i--;   
        }

        while(j>=0)
        {
            sum = (B[j])+carry;
            int lastdigit = sum%10;
            ans.add(lastdigit);
            carry = sum/10;
            j--;   
        }

        while(carry!=0)
        {
            sum = carry;
            int lastdigit = sum%10;
            ans.add(lastdigit);
            carry = sum/10;
            
        }

        int[] res = new int[ans.size()];
        int index = 0;
        for( i=ans.size()-1; i>=0; i--)
        {
            res[index] = ans.get(i);
            index++;
        }
       
         return res;
    }
}
