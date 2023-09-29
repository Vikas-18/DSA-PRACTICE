public class largestOddNumber {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }
    public static String largestOddNumber(String num) {
        String ans = "";
        int idx=-1;
       
        for(int i=num.length()-1; i>=0; i--)
        {
            if((num.charAt(i)-48)%2!=0)
            {
               idx=i;
               break;
            }
        }

        for(int i=0; i<=idx; i++)
        {
            ans+=num.charAt(i);
        }
    
        return ans;
    }
}
