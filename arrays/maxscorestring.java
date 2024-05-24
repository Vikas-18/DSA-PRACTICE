public class maxscorestring {
    public static void main(String[] args) {
        String[] words = { "dog", "cat", "dad", "good" };
        char[] letters = { 'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o' };
        int[] score = { 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(maxScoreWords(words, letters, score));
    }

    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int ans = 0;

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = 0; j < letters.length; j++) {
                temp += letters[j];
            }
            String s = words[i];
            if (check(s, temp)) {
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += score[s.charAt(j) - 'a'];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static boolean check(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] <= 0) {
                return false;
            } else {
                arr[s.charAt(i) - 'a']--;
            }
        }
        return true;
    }
}
