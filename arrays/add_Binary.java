public class add_Binary {
    public static void main(String[] args) {
        String a  = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a, String b) {
        String ans="";

        int i=a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 && j>=0)
        {

            int sum = ((int)a.charAt(i)-48 + (int)b.charAt(j)-48 + carry);
            int digit = sum%2;
            carry= sum/2;

            ans = Integer.toString(digit)+ ans;
            i--;
            j--;
        }
      
        while(i>=0)
        {
            int sum = ((int)a.charAt(i)-48 + carry);
            int digit = sum%2;
            carry= sum/2;
            ans = Integer.toString(digit)+ ans;
            i--;
        }

        while(j>=0)
        { 
            int sum = ((int)b.charAt(j)-48 + carry);
            int digit = sum%2;
            carry= sum/2;
            ans = Integer.toString(digit)+ ans;
            j--;
        }

        while(carry>0)
        {
            ans = Integer.toString(carry)+ ans;
            carry = 0;
        }
          
        return ans;
    }
}
