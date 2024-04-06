import java.util.Stack;

public class removeparanthesis {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }

    public static String minRemoveToMakeValid(String s) {

        Stack<Integer> st = new Stack<>();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (st.size() > 0 && s.charAt(i) == ')' && s.charAt(st.peek()) == '(') {
                st.pop();
            } else if (s.charAt(i) == ')' || s.charAt(i) == '(') {
                st.add(i);
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (st.size() > 0 && st.peek() == i) {
                st.pop();
                continue;
            } else {
                ans = s.charAt(i) + ans;
            }
        }
        return ans;
    }
}
