package BottomUp;

public class palindromePartion {
    public static void main(String[] args) {

    }

    public static int PalinPartitionRecursive(String s) {
        int i = 0;
        int j = s.length() - 1;

        if (i >= j) {
            return 0;
        }
        if (isPalindrome(s)) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int temp = PalinPartitionRecursive(s.substring(i, k + 1)) +
                    PalinPartitionRecursive(s.substring(k + 1, j + 1))
                    + 1;
            ans = Math.min(ans, temp);
        }
        return ans;
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
