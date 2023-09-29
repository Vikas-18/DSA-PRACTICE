public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix1(strs));
    }
    public static String longestCommonPrefix1(String[] strs) {
        String ans ="";
        String temp = "";
        for(int i=0; i<strs[0].length(); i++)
        {
            temp += strs[0].charAt(i);
            for(int j=0; j<strs.length; j++)
            {
                if(j==strs.length-1 && checkPrefixPresent(temp,strs[j])==true)
                {
                    ans = temp;
                }
                else if(checkPrefixPresent(temp,strs[j])==false)
                {
                    return ans;
                }
            }
        }
        return ans;
    }
    public static boolean checkPrefixPresent(String s,String t)
    {
        int i=0;
        int j=0;
        if(t.length()<s.length())
        {
            return false;
        }
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)!=t.charAt(j))
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
