import java.util.Stack;

public class starsremove {
    public static void main(String[] args) {
        String  s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='*' && st.size()>0)
            {
                st.remove(st.peek());
            }
            else
            {
                st.add(s.charAt(i));
            }
        }
        while(st.size()>0)
        {
           ans = ans + st.pop();
        }

        return ans;
    }
}
