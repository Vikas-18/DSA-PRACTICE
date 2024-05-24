public class maxscorestring {
    public static void main(String[] args) {
        String[] words = { "dog", "cat", "dad", "good" };
        char[] letters = { 'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o' };
        int[] score = { 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(maxScoreWords(words, letters, score));
    }

    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] frq = new int[26];
        for (int i = 0; i < letters.length; i++) {
            frq[letters[i] - 'a']++;
        }
        return solve(words, 0, frq, score);
    }

    public static int solve(String[] words, int idx, int[] frq, int[] score) {
        if (idx == words.length) {
            return 0;
        }

        int notPick = solve(words, idx + 1, frq, score);
        int pick = 0;
        if (check(words[idx], frq)) {
            for (int i = 0; i < words[idx].length(); i++) {
                char ch = words[idx].charAt(i);
                frq[ch - 'a']--;
            }
            pick = getScore(words[idx], score) + solve(words, idx + 1, frq, score);
            for (int i = 0; i < words[idx].length(); i++) {
                char ch = words[idx].charAt(i);
                frq[ch - 'a']++;
            }
        }
        return Math.max(pick, notPick);
    }

    public static boolean check(String s, int[] frq) {
        int[] temp = frq.clone();
        for (int i = 0; i < s.length(); i++) {
            if (temp[s.charAt(i) - 'a'] <= 0) {
                return false;
            } else {
                temp[s.charAt(i) - 'a']--;
            }
        }
        return true;
    }

    public static int getScore(String s, int[] score) {
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            sum += score[s.charAt(j) - 'a'];
        }
        return sum;
    }
}
