
import java.util.*;

public class balanced {
    public static void main(String[] args) {
        String s = "[([]])";
        System.out.println(isValid(s));
    }

    static int solve(String A) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                char ch = A.charAt(i);
                s.push(A.charAt(i));
            } else if (A.charAt(0) == ')') {
                return 0;
            }

            else {
                if (s.size() != 0 && A.charAt(i) == ')' && s.peek() == '(') {
                    s.pop();
                } else {
                    return 0;
                }
            }
        }

        if (s.size() == 0)
            return 1;

        if (s.size() != 0) {
            return 0;
        }
        return -1;
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.add(s.charAt(i));
            } else if (st.size() > 0 && st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            } else if (st.size() > 0 && st.peek() == '{' && s.charAt(i) == '}') {
                st.pop();
            } else if (st.size() > 0 && st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
            } else {
                st.add(s.charAt(i));
            }
        }
        return st.isEmpty();
    }

}
