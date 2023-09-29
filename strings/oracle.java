import java.util.Arrays;

public class oracle {
    public static void main(String[] args) {
        System.out.println(countGoodSubsequences("abca"));
    }

    public static int countGoodSubsequences(String s) {
        int MOD = 1000000007; // Modulus value for avoiding integer overflow
        int n = s.length();
        int[] lastOccurrence = new int[26]; // Assuming input only contains lowercase letters
        Arrays.fill(lastOccurrence, -1);

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            char currentChar = s.charAt(i - 1);
            int currentCharIndex = currentChar - 'a';
            dp[i] = (2 * dp[i - 1]) % MOD;

            if (lastOccurrence[currentCharIndex] != -1) {
                dp[i] = (dp[i] - dp[lastOccurrence[currentCharIndex] - 1] + MOD) % MOD;
            }

            lastOccurrence[currentCharIndex] = i;
        }

        int totalGoodSubsequences = (dp[n] - 1 + MOD) % MOD; // Subtract 1 to exclude the empty string
        return totalGoodSubsequences;
    }

}
