import java.util.Scanner;

public class verifyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            // inc letter inc num letter k baad letter hona chaiye
            System.out.println(solve(n, s));
        }
    }

    public static String solve(int n, String s) {
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasLetter = false;

        // Check for invalid characters and categorize characters
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return "No";
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLetter = true;
            }
        }

        // Check if digits follow letters
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))) {
                return "No";
            }
        }

        // Check if digits are sorted
        if (hasDigit) {
            char prevDigit = '0';
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    if (c < prevDigit) {
                        return "No";
                    }
                    prevDigit = c;
                }
            }
        }

        // Check if letters are sorted
        if (hasLetter) {
            char prevLetter = 'a';
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (c < prevLetter) {
                        return "No";
                    }
                    prevLetter = c;
                }
            }
        }

        return "Yes";

    }
}
