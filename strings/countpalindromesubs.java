import java.util.ArrayList;

public class countpalindromesubs {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }

    public static int countSubstrings(String s) {
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<s.length(); i++)
        { 
            String st = "";
            for(int j=i; j<s.length(); j++)
            {
               st+=s.charAt(j);
               arr.add(st);
            }
        }
        int ans = 0;
        for(int i=0; i<arr.size(); i++)
        {
            if(isPalindrome(arr.get(i)))
            {
                ans++;
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
