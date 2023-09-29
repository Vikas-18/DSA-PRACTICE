import java.util.*;

public class binary_add {
    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "1";
        int i = s1.charAt(0);
        
        System.out.println(add(s1, s2));

    }

    static String add(String s1, String s2)
    {
        int i = s1.length()-1;
        int j = s2.length()-1;
        String ans = "";
        int carry =0;
        while (i>=0 && j>=0) {
            
            int sum = (s1.charAt(i)-48) + (s2.charAt(j)-48) + carry;
            int lastdigit = sum%2;
            ans = ans+lastdigit;
            carry = sum/2;
            i--;
            j--;
        }
        while (i>=0) {
            int sum = (s1.charAt(i)-48) + carry;
            int lastdigit = sum%2;
            ans = ans+lastdigit;
            carry = sum/2;
            i--;
       
        }
        while (j>=0) {
            int sum = (s2.charAt(j)-48) + carry;
            int lastdigit = sum%2;
            ans = ans+lastdigit;
            carry = sum/2;
            j--;
        }
        while (carry!=0) {
            int sum =  carry;
            int lastdigit = sum%2;
            ans = ans+lastdigit;
            carry = sum/2;
        }

        String res = "";
        
        for (int k = ans.length()-1; k>=0; k--) {
             res = res + ans.charAt(k);
        }

        return res;
    }
}
