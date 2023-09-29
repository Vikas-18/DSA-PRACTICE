public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
    static int isPalindrome(String S) {
        int i=0;
        int j=S.length()-1;
        
        while(i<j)
        {
            if(S.charAt(i)==S.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
