import java.util.Stack;

/**
 * maxDepth
 */
public class maxiDepth {

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int ans = 0;
        int count = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.add(s.charAt(i));
                count++;
            } else if (st.size() > 0 && st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
                count = 0;
                if (st.isEmpty()) {
                    ans = Math.max(ans, count);
                }
            } else if (st.size() > 0 && st.peek() == '{' && s.charAt(i) == '}') {
                st.pop();
                count = 0;
                if (st.isEmpty()) {
                    ans = Math.max(ans, count);
                }
            } else if (st.size() > 0 && st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
                count = 0;
                if (st.isEmpty()) {
                    ans = Math.max(ans, count);
                }
            }
            // else if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{' )
            // {
            // st.add(s.charAt(i));
            // }
        }
        return ans;
    }
}