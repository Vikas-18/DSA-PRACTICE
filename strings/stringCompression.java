public class stringCompression {
    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(compressedString(word));
    }

    public static String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i < word.length(); i++) {
            if (cnt < 9 && word.charAt(i) == word.charAt(i - 1)) {
                cnt++;
            } else {
                ans.append(Integer.toString(cnt));
                ans.append(word.charAt(i - 1));
                cnt = 1;

            }

        }
        return ans.toString();
    }
}
