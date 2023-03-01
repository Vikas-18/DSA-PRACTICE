import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "[([]])";
        System.out.println(isValid(s));
    }
        public static boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
    
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                {
                    st.push(s.charAt(i));
                }
                else if(s.charAt(i)==')')
                {
                    if(st.size()==0)
                    {
                       return false;
                    }
                    else if(st.peek()=='(')
                   st.pop();
                   else if(st.peek()!='(')
                   return false;
                }
                  else if(s.charAt(i)=='}')
                {
                      if(st.size()==0)
                    {
                       return false;
                    }
                    else if(st.peek()=='{')
                   st.pop();
                   else if(st.peek()!='{')
                   return false;
                }
                  else if(s.charAt(i)==']')
                {
                    if(st.size()==0)
                    {
                       return false;
                    }
                    else if(st.peek()=='[')
                   st.pop();
                  else if(st.peek()!='[')
                   return false;
                }
            }
            if(st.size()!=0)
            {
                return false;
            }
            return true;
        }
}
