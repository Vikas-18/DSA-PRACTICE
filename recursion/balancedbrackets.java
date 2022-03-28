import java.util.*;
public class balancedbrackets {
    public static void main(String[] args) {
      
    }
    static boolean balanced(String s)
    {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='(')
            {
                st.push(ch);
                
            }
            else{
                if(st.peek()==ch)
                {
                    st.pop();
                }
                else if(st.peek()!=ch)
                {
                    return false;
                }
            }
            if (st.size()!=0) {
                return false;
            }
        }
        return true;
    }
   
}
