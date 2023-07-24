import java.util.Stack;

public class postfix {

    public static void main(String[] args) {
        String s = "534+*2/";
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.add(num1 + num2);
            } else if (s.charAt(i) == '-') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.add(num2 - num1);
            } else if (s.charAt(i) == '/') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.add(num2 / num1);
            } else if (s.charAt(i) == '*') {
                int num1 = st.pop();
                int num2 = st.pop();
                st.add(num1 * num2);
            } else {
                st.add(s.charAt(i) - '0');
            }
        }
        System.out.println(st.pop());
    }
}